package h91;

import com.github.rudroid.copilot.h1;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class s implements k0 {
    public byte r;
    public e0 s;
    public Inflater t;
    public t u;
    public CRC32 v;

    public s(j jVar) {
        k71.k.g(jVar, "source");
        e0 e0Var = new e0(jVar);
        this.s = e0Var;
        Inflater inflater = new Inflater(true);
        this.t = inflater;
        this.u = new t(e0Var, inflater);
        this.v = new CRC32();
    }

    public static void f(int i, String str, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + t71.p.Y(b.h(i2), 8, '0') + " != expected 0x" + t71.p.Y(b.h(i), 8, '0'));
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        s sVar = this;
        k71.k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = sVar.r;
        CRC32 crc32 = sVar.v;
        e0 e0Var = sVar.s;
        if (b == 0) {
            e0Var.C0(10L);
            h hVar2 = e0Var.s;
            byte F = hVar2.F(3L);
            boolean z = ((F >> 1) & 1) == 1;
            if (z) {
                sVar.m(hVar2, 0L, 10L);
            }
            f(8075, "ID1ID2", e0Var.readShort());
            e0Var.skip(8L);
            if (((F >> 2) & 1) == 1) {
                e0Var.C0(2L);
                if (z) {
                    m(hVar2, 0L, 2L);
                }
                long e0 = hVar2.e0() & 65535;
                e0Var.C0(e0);
                if (z) {
                    m(hVar2, 0L, e0);
                }
                e0Var.skip(e0);
            }
            if (((F >> 3) & 1) == 1) {
                long f = e0Var.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m(hVar2, 0L, f + 1);
                }
                e0Var.skip(f + 1);
            }
            if (((F >> 4) & 1) == 1) {
                long f2 = e0Var.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    sVar = this;
                    sVar.m(hVar2, 0L, f2 + 1);
                } else {
                    sVar = this;
                }
                e0Var.skip(f2 + 1);
            } else {
                sVar = this;
            }
            if (z) {
                f(e0Var.t(), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            sVar.r = (byte) 1;
        }
        if (sVar.r == 1) {
            long j2 = hVar.s;
            long U = sVar.u.U(hVar, j);
            if (U != -1) {
                sVar.m(hVar, j2, U);
                return U;
            }
            sVar.r = (byte) 2;
        }
        if (sVar.r == 2) {
            f(e0Var.m(), "CRC", (int) crc32.getValue());
            f(e0Var.m(), "ISIZE", (int) sVar.t.getBytesWritten());
            sVar.r = (byte) 3;
            if (!e0Var.L()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // h91.k0
    public final m0 b() {
        return this.s.r.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.u.close();
    }

    public final void m(h hVar, long j, long j2) {
        f0 f0Var = hVar.r;
        k71.k.d(f0Var);
        while (true) {
            int i = f0Var.c;
            int i2 = f0Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            f0Var = f0Var.f;
            k71.k.d(f0Var);
        }
        while (j2 > 0) {
            int min = (int) Math.min(f0Var.c - r6, j2);
            this.v.update(f0Var.a, (int) (f0Var.b + j), min);
            j2 -= min;
            f0Var = f0Var.f;
            k71.k.d(f0Var);
            j = 0;
        }
    }
}
