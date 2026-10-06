"""Embedded Flask launcher: loopback-only, cloud storage disabled, one server per process."""
import os
import threading

from werkzeug.serving import make_server

_lock = threading.RLock()
_httpd = None
_thread = None


def start(data_dir):
    global _httpd, _thread
    with _lock:
        if _httpd is not None:
            return int(_httpd.server_port)

        os.makedirs(data_dir, exist_ok=True)
        os.environ["PYAPP_DATA_DIR"] = data_dir
        # The app requested cloud storage be disabled: keys stay in app-private local storage.
        os.environ["FIREBASE_DB_URL"] = ""
        os.environ["FIREBASE_API_KEY"] = ""

        import secrets
        import server

        token = secrets.token_urlsafe(32)
        server.app.config["LOCAL_ENGINE_TOKEN"] = token
        server.app.config["MAX_CONTENT_LENGTH"] = 100 * 1024 * 1024
        server.app.config["DEBUG"] = False
        server.app.config["TESTING"] = False

        _httpd = make_server("127.0.0.1", 0, server.app, threaded=True)
        _thread = threading.Thread(target=_httpd.serve_forever, name="embedded-flask", daemon=True)
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
