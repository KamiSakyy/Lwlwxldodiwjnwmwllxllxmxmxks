#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Мини-инспектор dex: строки, типы, методы (можно грепать)."""
import struct
import sys


def uleb(d, off):
    res = 0
    shift = 0
    while True:
        b = d[off]
        off += 1
        res |= (b & 0x7f) << shift
        if not (b & 0x80):
            break
        shift += 7
    return res, off


class Dex:
    def __init__(self, path):
        self.d = open(path, 'rb').read()
        self.path = path

    def strings(self):
        size, off = struct.unpack_from('<II', self.d, 0x38)
        out = []
        for i in range(size):
            o = struct.unpack_from('<I', self.d, off + 4 * i)[0]
            n, p = uleb(self.d, o)
            out.append(self.d[p:p + n].decode('utf-8', 'replace'))
        return out

    def types(self):
        size, off = struct.unpack_from('<II', self.d, 0x40)
        S = self.strings()
        return [S[struct.unpack_from('<I', self.d, off + 4 * i)[0]] for i in range(size)]

    def protos(self):
        size, off = struct.unpack_from('<II', self.d, 0x48)
        T = self.types()
        def tl(o):
            if o == 0:
                return []
            n = struct.unpack_from('<I', self.d, o)[0]
            return [T[struct.unpack_from('<H', self.d, o + 4 + 2 * i)[0]] for i in range(n)]
        out = []
        for i in range(size):
            shorty, ret, par = struct.unpack_from('<III', self.d, off + 12 * i)
            out.append((T[ret], tl(par)))
        return out

    def fields(self):
        size, off = struct.unpack_from('<II', self.d, 0x50)
        T, S = self.types(), self.strings()
        out = []
        for i in range(size):
            c, t, n = struct.unpack_from('<HHI', self.d, off + 8 * i)
            out.append('%s->%s' % (T[c], S[n]) + ' :' + T[t])
        return out

    def methods(self):
        size, off = struct.unpack_from('<II', self.d, 0x58)
        T, S, P = self.types(), self.strings(), self.protos()
        out = []
        for i in range(size):
            c, pr, n = struct.unpack_from('<HHI', self.d, off + 8 * i)
            ret, pars = P[pr]
            sig = ''.join(pars) + ret
            out.append('%s->%s(%s)' % (T[c], S[n], sig))
        return out


if __name__ == '__main__':
    path = sys.argv[1]
    what = sys.argv[2] if len(sys.argv) > 2 else 'counts'
    dx = Dex(path)
    if what == 'counts':
        print('%s: строк=%d типов=%d методов=%d' % (
            path, len(dx.strings()), len(dx.types()), len(dx.methods())))
    else:
        pat = sys.argv[3] if len(sys.argv) > 3 else what
        items = {'strings': dx.strings, 'types': dx.types, 'methods': dx.methods, 'fields': dx.fields}[
            what if what != 'grep' else 'methods']()
        for it in items:
            if pat.lower() in it.lower():
                print(it)
