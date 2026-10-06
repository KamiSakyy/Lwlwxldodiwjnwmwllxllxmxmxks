#!/usr/bin/env python3
"""Расшифровывает параметр authError из ссылки-редиректа Google в читаемый текст.

Google возвращает причину отказа на странице авторизации не в HTML, а в base64 внутри
адреса `accounts.google.com/signin/oauth/error?authError=...`. Скрипт печатает
человекочитаемые строки (кириллицу и латиницу), чтобы их можно было показать в CI.
Использование: echo "<location>" | python3 tools/oauth-decode.py
"""
import base64
import sys
import urllib.parse


def main() -> None:
    raw = urllib.parse.unquote(sys.stdin.read().strip())
    if not raw:
        print("(пусто)")
        return
    raw += "=" * ((4 - len(raw) % 4) % 4)
    try:
        data = base64.urlsafe_b64decode(raw)
    except Exception as exc:  # noqa: BLE001
        print(f"(не удалось декодировать: {exc})")
        return
    text = "".join(chr(b) if 32 <= b < 127 or b >= 0xC0 else " " for b in data)
    print(" ".join(text.split()))


if __name__ == "__main__":
    main()
