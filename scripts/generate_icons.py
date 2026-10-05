#!/usr/bin/env python3
"""Generate tiny source PNG launcher icons without external image dependencies."""
from __future__ import annotations

import struct
import zlib
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
DENSITIES = {"mdpi": 48, "hdpi": 72, "xhdpi": 96, "xxhdpi": 144, "xxxhdpi": 192}


def png_chunk(kind: bytes, payload: bytes) -> bytes:
    body = kind + payload
    return struct.pack(">I", len(payload)) + body + struct.pack(">I", zlib.crc32(body) & 0xFFFFFFFF)


def paint_icon(size: int, main: tuple[int, int, int], accent: tuple[int, int, int]) -> bytes:
    pixels = bytearray(size * size * 4)
    for y in range(size):
        ratio = y / max(1, size - 1)
        row = tuple(round(main[c] * (1 - ratio * 0.20) + accent[c] * ratio * 0.20) for c in range(3))
        for x in range(size):
            at = (y * size + x) * 4
            pixels[at:at + 4] = bytes((*row, 255))

    width = max(2.0, size * 0.075)
    radius = width / 2
    white = (255, 255, 255, 255)
    lime = (181, 255, 226, 255)

    def dot(cx: float, cy: float, color: tuple[int, int, int, int]) -> None:
        r = int(radius + 1)
        for yy in range(max(0, int(cy) - r), min(size, int(cy) + r + 1)):
            for xx in range(max(0, int(cx) - r), min(size, int(cx) + r + 1)):
                if (xx - cx) ** 2 + (yy - cy) ** 2 <= radius ** 2:
                    off = (yy * size + xx) * 4
                    pixels[off:off + 4] = bytes(color)

    def line(x0: float, y0: float, x1: float, y1: float, color: tuple[int, int, int, int]) -> None:
        steps = max(1, int(max(abs(x1 - x0), abs(y1 - y0)) * 2))
        for step in range(steps + 1):
            t = step / steps
            dot(x0 + (x1 - x0) * t, y0 + (y1 - y0) * t, color)

    line(size * .39, size * .31, size * .25, size * .50, white)
    line(size * .25, size * .50, size * .39, size * .69, white)
    line(size * .61, size * .31, size * .75, size * .50, white)
    line(size * .75, size * .50, size * .61, size * .69, white)
    line(size * .55, size * .27, size * .45, size * .73, lime)

    scanlines = bytearray()
    stride = size * 4
    for y in range(size):
        scanlines.append(0)
        scanlines.extend(pixels[y * stride:(y + 1) * stride])
    return (b"\x89PNG\r\n\x1a\n"
            + png_chunk(b"IHDR", struct.pack(">IIBBBBB", size, size, 8, 6, 0, 0, 0))
            + png_chunk(b"IDAT", zlib.compress(bytes(scanlines), 9))
            + png_chunk(b"IEND", b""))


def main() -> None:
    palettes = {
        ROOT / "app/src/main/res": ((73, 76, 194), (37, 49, 117)),
        ROOT / "template/src/main/res": ((20, 146, 135), (20, 69, 107)),
    }
    for resource_root, (primary, secondary) in palettes.items():
        for density, size in DENSITIES.items():
            target = resource_root / f"mipmap-{density}/ic_launcher.png"
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_bytes(paint_icon(size, primary, secondary))
            print(target.relative_to(ROOT))


if __name__ == "__main__":
    main()
