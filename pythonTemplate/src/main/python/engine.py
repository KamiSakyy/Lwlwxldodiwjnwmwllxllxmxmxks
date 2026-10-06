"""Offline project runner for bundled Flask/WSGI applications on Android."""
from __future__ import annotations

import importlib
import json
import os
import shutil
import sys
import threading
import zipfile
from pathlib import Path, PurePosixPath

from werkzeug.serving import make_server

_lock = threading.RLock()
_httpd = None
_thread = None


def _wheel_site_packages(project_dir: Path, data_dir: Path) -> Path:
    wheels = sorted((project_dir / "wheels").rglob("*.whl")) if (project_dir / "wheels").is_dir() else []
    target = data_dir / "python-site-packages"
    signature = "\n".join(f"{wheel.relative_to(project_dir)}:{wheel.stat().st_size}:{wheel.stat().st_mtime_ns}" for wheel in wheels)
    marker = target / ".webapk-wheel-signature"
    try:
        if marker.is_file() and marker.read_text(encoding="utf-8") == signature:
            return target
    except OSError:
        pass

    if target.exists():
        shutil.rmtree(target)
    target.mkdir(parents=True, exist_ok=True)
    extracted_files = 0
    extracted_bytes = 0
    for wheel in wheels:
        with zipfile.ZipFile(wheel) as archive:
            for member in archive.infolist():
                name = member.filename.replace("\\", "/")
                parts = PurePosixPath(name).parts
                if not name or name.startswith("/") or any(part in ("", ".", "..") for part in parts):
                    raise RuntimeError(f"Unsafe path in wheel {wheel.name}: {name}")
                if parts[0].endswith(".data"):
                    if len(parts) < 3 or parts[1] not in ("purelib", "platlib"):
                        continue
                    parts = parts[2:]
                if not parts:
                    continue
                destination = target.joinpath(*parts)
                destination.parent.mkdir(parents=True, exist_ok=True)
                if member.is_dir():
                    destination.mkdir(parents=True, exist_ok=True)
                    continue
                extracted_files += 1
                extracted_bytes += member.file_size
                if extracted_files > 100_000 or extracted_bytes > 2 * 1024 * 1024 * 1024:
                    raise RuntimeError("Offline wheel bundle exceeds the safe extraction limit.")
                with archive.open(member) as source, destination.open("wb") as output:
                    shutil.copyfileobj(source, output)
    marker.write_text(signature, encoding="utf-8")
    return target


def _module_names(project_dir: Path):
    roots = [project_dir]
    if (project_dir / "src").is_dir():
        roots.append(project_dir / "src")
    for root in roots:
        if str(root) not in sys.path:
            sys.path.insert(0, str(root))
    candidates = ("wsgi", "app", "application", "server", "main")
    for root in roots:
        for name in candidates:
            if (root / f"{name}.py").is_file() or (root / name / "__init__.py").is_file():
                yield name


def _load_wsgi_app(project_dir: Path):
    config_path = project_dir / "webapk.json"
    entrypoint = None
    if config_path.is_file():
        try:
            config = json.loads(config_path.read_text(encoding="utf-8"))
            entrypoint = config.get("entrypoint")
        except Exception as error:
            raise RuntimeError(f"Invalid webapk.json: {error}") from error

    choices = []
    if entrypoint:
        if not isinstance(entrypoint, str) or ":" not in entrypoint:
            raise RuntimeError("webapk.json entrypoint must have the form 'module:app' or 'module:create_app'.")
        module_name, attribute = entrypoint.split(":", 1)
        choices.append((module_name.strip(), attribute.strip()))
    else:
        for module_name in _module_names(project_dir):
            for attribute in ("app", "application", "create_app", "make_app"):
                choices.append((module_name, attribute))

    errors = []
    for module_name, attribute in choices:
        try:
            module = importlib.import_module(module_name)
            candidate = getattr(module, attribute, None)
            if candidate is None:
                continue
            if attribute in ("create_app", "make_app") and callable(candidate):
                candidate = candidate()
            if callable(candidate):
                return candidate
        except Exception as error:
            errors.append(f"{module_name}:{attribute}: {type(error).__name__}: {error}")
            if entrypoint:
                break
    detail = "\n".join(errors[-5:])
    message = "No WSGI application was found. Add webapk.json with entrypoint='module:app', or expose app/application in wsgi.py or app.py."
    if detail:
        message += "\nImport errors:\n" + detail
    raise RuntimeError(message)


def start(data_dir, project_dir):
    """Start an imported WSGI app on an ephemeral loopback port and return the port."""
    global _httpd, _thread
    with _lock:
        if _httpd is not None:
            return int(_httpd.server_port)

        data_path = Path(data_dir).resolve()
        project_path = Path(project_dir).resolve()
        if not project_path.is_dir():
            raise RuntimeError(f"Python project directory does not exist: {project_path}")
        data_path.mkdir(parents=True, exist_ok=True)
        os.environ["PYAPP_DATA_DIR"] = str(data_path)
        os.chdir(project_path)

        vendor = _wheel_site_packages(project_path, data_path)
        for path in (project_path / "site-packages", project_path / "vendor", vendor):
            if path.is_dir() and str(path) not in sys.path:
                sys.path.insert(0, str(path))
        app = _load_wsgi_app(project_path)
        _httpd = make_server("127.0.0.1", 0, app, threaded=True)
        _thread = threading.Thread(target=_httpd.serve_forever, name="embedded-wsgi", daemon=True)
        _thread.start()
        return int(_httpd.server_port)


def stop():
    global _httpd, _thread
    with _lock:
        httpd = _httpd
        thread = _thread
        _httpd = None
        _thread = None
    if httpd is not None:
        httpd.shutdown()
        httpd.server_close()
    if thread is not None and thread.is_alive():
        thread.join(timeout=2.0)
