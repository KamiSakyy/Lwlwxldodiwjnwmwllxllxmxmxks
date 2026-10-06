#!/usr/bin/env python3
"""Host-side smoke test for the bundled Flask engine, auth guard, and disabled cloud mode."""
from __future__ import annotations

import http.client
import json
import re
import sys
import tempfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
PYTHON_SOURCE = ROOT / "pythonTemplate/src/main/python"
sys.path.insert(0, str(PYTHON_SOURCE))

import engine  # noqa: E402


def request(port: int, path: str, token: str | None = None) -> tuple[int, str]:
    headers = {"X-Local-Engine-Token": token} if token else {}
    connection = http.client.HTTPConnection("127.0.0.1", port, timeout=10)
    try:
        connection.request("GET", path, headers=headers)
        response = connection.getresponse()
        return response.status, response.read().decode("utf-8", errors="replace")
    finally:
        connection.close()


def main() -> None:
    with tempfile.TemporaryDirectory(prefix="webapk-python-smoke-") as data_dir:
        port = engine.start(data_dir)
        try:
            assert engine._httpd.server_address[0] == "127.0.0.1", engine._httpd.server_address
            status, page = request(port, "/")
            assert status == 200, f"Flask root returned HTTP {status}"
            match = re.search(r'const TOKEN=("[^"]+")', page)
            assert match, "HTML does not contain the local API token bootstrap"
            token = json.loads(match.group(1))

            ping_status, _ = request(port, "/api/ping")
            assert ping_status == 200, f"health endpoint returned HTTP {ping_status}"
            denied_status, _ = request(port, "/api/not-a-route")
            assert denied_status == 403, f"API accepted a missing token (HTTP {denied_status})"
            allowed_status, _ = request(port, "/api/not-a-route", token)
            assert allowed_status == 404, f"valid token did not reach Flask routing (HTTP {allowed_status})"
            cloud_status, _ = request(port, "/cloud/", token)
            assert cloud_status == 501, f"cloud endpoint was not disabled (HTTP {cloud_status})"

            import server  # noqa: E402

            assert server.FIREBASE_DB_URL == "" and server.FIREBASE_API_KEY == ""
            assert Path(server.KEYS_FILE) == Path(data_dir) / "keys_storage.json"
        finally:
            engine.stop()
    print("Python runtime smoke passed: loopback bind, WebView token, API guard, cloud/Firebase disabled.")


if __name__ == "__main__":
    main()
