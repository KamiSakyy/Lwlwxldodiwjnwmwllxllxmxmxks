#!/usr/bin/env python3
"""Offline smoke tests for arbitrary Flask projects, bundled wheels, and server (13)."""
from __future__ import annotations

import http.client
import json
import os
import shutil
import sys
import tempfile
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
PYTHON_SOURCE = ROOT / "pythonTemplate/src/main/python"
sys.path.insert(0, str(PYTHON_SOURCE))

import engine  # noqa: E402


def request(port: int, path: str, headers: dict[str, str] | None = None) -> tuple[int, str]:
    connection = http.client.HTTPConnection("127.0.0.1", port, timeout=10)
    try:
        connection.request("GET", path, headers=headers or {})
        response = connection.getresponse()
        return response.status, response.read().decode("utf-8", errors="replace")
    finally:
        connection.close()


def make_offline_wheel(project: Path) -> None:
    wheel_dir = project / "wheels"
    wheel_dir.mkdir(parents=True)
    (project / "requirements.txt").write_text("offline-demo==1.0\n", encoding="utf-8")
    with zipfile.ZipFile(wheel_dir / "offline_demo-1.0-py3-none-any.whl", "w") as archive:
        archive.writestr("offline_demo/__init__.py", "MESSAGE = 'offline wheel imported'\n")
        archive.writestr("offline_demo-1.0.dist-info/METADATA", "Metadata-Version: 2.1\nName: offline-demo\nVersion: 1.0\n")
        archive.writestr("offline_demo-1.0.dist-info/WHEEL", "Wheel-Version: 1.0\nRoot-Is-Purelib: true\nTag: py3-none-any\n")


def main() -> None:
    with tempfile.TemporaryDirectory(prefix="webapk-python-smoke-") as temporary:
        base = Path(temporary)
        app_project = base / "custom-flask-site"
        app_project.mkdir()
        make_offline_wheel(app_project)
        (app_project / "app.py").write_text(
            "from flask import Flask\n"
            "import offline_demo\n"
            "app = Flask(__name__)\n"
            "@app.get('/')\n"
            "def index(): return offline_demo.MESSAGE\n",
            encoding="utf-8",
        )
        previous_firebase_url = os.environ.get("FIREBASE_DB_URL")
        os.environ["FIREBASE_DB_URL"] = "https://example.invalid/custom-project"
        port = engine.start(str(base / "app-data"), str(app_project))
        try:
            assert os.environ["FIREBASE_DB_URL"] == "https://example.invalid/custom-project"
            assert engine._httpd.server_address[0] == "127.0.0.1", engine._httpd.server_address
            status, body = request(port, "/")
            assert status == 200 and "offline wheel imported" in body, (status, body)
        finally:
            engine.stop()
            if previous_firebase_url is None:
                os.environ.pop("FIREBASE_DB_URL", None)
            else:
                os.environ["FIREBASE_DB_URL"] = previous_firebase_url

        original_project = base / "server-13"
        original_project.mkdir()
        shutil.copy2(PYTHON_SOURCE / "server.py", original_project / "server.py")
        shutil.copy2(PYTHON_SOURCE / "cloud.py", original_project / "cloud.py")
        (original_project / "webapk.json").write_text(
            json.dumps({"entrypoint": "server:app"}), encoding="utf-8"
        )
        port = engine.start(str(base / "server-data"), str(original_project))
        try:
            import server  # noqa: E402
            assert server.FIREBASE_DB_URL == "" and server.FIREBASE_API_KEY == ""
            assert Path(server.KEYS_FILE) == base / "server-data" / "keys_storage.json"
            status, body = request(port, "/api/ping")
            assert status == 200 and '"ok":true' in body, (status, body)
            token = server.app.config["LOCAL_ENGINE_TOKEN"]
            home_status, home_body = request(port, "/")
            assert home_status == 200 and token in home_body, (home_status, "bootstrap token missing")
            cloud_status, cloud_body = request(port, "/cloud/")
            assert cloud_status == 403 and "authorization required" in cloud_body.lower(), (cloud_status, cloud_body)
            cloud_status, cloud_body = request(port, "/cloud/", {"X-Local-Engine-Token": token})
            assert cloud_status == 501 and "disabled" in cloud_body.lower(), (cloud_status, cloud_body)
        finally:
            engine.stop()
    print("Offline Python smoke passed: imported Flask app, local wheel, loopback bind, server (13), cloud/Firebase disabled.")


if __name__ == "__main__":
    main()
