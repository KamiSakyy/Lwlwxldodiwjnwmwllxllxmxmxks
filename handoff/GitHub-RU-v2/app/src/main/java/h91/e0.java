package h91;

import com.github.rudroid.copilot.h1;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e0 implements j {
    public final k0 r;
    public final h s;
    public boolean t;

    public e0(k0 k0Var) {
        k71.k.g(k0Var, "source");
        this.r = k0Var;
        this.s = new h();
    }

    public final String A(long j) {
        C0(j);
        h hVar = this.s;
        hVar.getClass();
        return hVar.i0(j, t71.a.a);
    }

    @Override // h91.j
    public final boolean A0(long j, k kVar) {
        long a;
        long j2;
        long j3;
        long j4;
        k71.k.g(kVar, "bytes");
        int d = kVar.d();
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        if (d < 0 || j < 0 || d > kVar.d()) {
            return false;
        }
        if (d == 0) {
            return true;
        }
        long j5 = 1;
        long j6 = j + 1;
        long j7 = d;
        b.e(kVar.d(), 0, j7);
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        long j8 = j;
        loop0: while (true) {
            h hVar = this.s;
            a = i91.a.a(hVar, kVar, j8, j6, d);
            if (a == -1) {
                long j9 = hVar.s;
                j2 = -1;
                long j10 = (j9 - j7) + j5;
                if (j10 >= j6) {
                    break;
                }
                if (j9 >= j6) {
                    int max = (int) Math.max(j5, (j9 - j6) + j5);
                    j3 = j5;
                    int min = ((int) Math.min(j7, (hVar.s - j8) + j3)) - 1;
                    if (max > min) {
                        break;
                    }
                    j4 = j6;
                    while (!hVar.N(min, hVar.s - min, kVar)) {
                        if (min == max) {
                            break loop0;
                        }
                        min--;
                    }
                } else {
                    j4 = j6;
                    j3 = j5;
                }
                if (this.r.U(hVar, 8192L) == -1) {
                    break;
                }
                j8 = Math.max(j8, j10);
                j5 = j3;
                j6 = j4;
            } else {
                j2 = -1;
                break;
            }
        }
        a = -1;
        return a != j2;
    }

    @Override // h91.j
    public final void C0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // h91.j
    public final InputStream G0() {
        return new g(this, 1);
    }

    @Override // h91.j
    public final byte[] H() {
        k0 k0Var = this.r;
        h hVar = this.s;
        hVar.G(k0Var);
        return hVar.W(hVar.s);
    }

    @Override // h91.j
    public final boolean L() {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.s;
        return hVar.L() && this.r.U(hVar, 8192L) == -1;
    }

    @Override // h91.j
    public final String P(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("limit < 0: ", j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long f = f((byte) 10, 0L, j2);
        h hVar = this.s;
        if (f != -1) {
            return i91.a.c(hVar, f);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && hVar.F(j2 - 1) == 13 && request(j2 + 1) && hVar.F(j2) == 10) {
            return i91.a.c(hVar, j2);
        }
        h hVar2 = new h();
        hVar.E(hVar2, 0L, Math.min(32, hVar.s));
        throw new EOFException("\\n not found: limit=" + Math.min(hVar.s, j) + " content=" + hVar2.v(hVar2.s).e() + (char) 8230);
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        k71.k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        h hVar2 = this.s;
        if (hVar2.s == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.r.U(hVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return hVar2.U(hVar, Math.min(j, hVar2.s));
    }

    @Override // h91.j
    public final int Z(y yVar) {
        k71.k.g(yVar, "options");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            h hVar = this.s;
            int d = i91.a.d(hVar, yVar, true);
            if (d != -2) {
                if (d != -1) {
                    hVar.skip(yVar.r[d].d());
                    return d;
                }
            } else if (this.r.U(hVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // h91.j
    public final h a() {
        return this.s;
    }

    @Override // h91.k0
    public final m0 b() {
        return this.r.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.r.close();
        this.s.r();
    }

    public final long f(byte b, long j, long j2) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(h1.m("fromIndex=0 toIndex=", j2).toString());
        }
        long j3 = 0;
        while (j3 < j2) {
            h hVar = this.s;
            byte b2 = b;
            long j4 = j2;
            long K = hVar.K(b2, j3, j4);
            if (K == -1) {
                long j5 = hVar.s;
                if (j5 >= j4 || this.r.U(hVar, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return K;
            }
        }
        return -1L;
    }

    @Override // h91.j
    public final String h0(Charset charset) {
        k71.k.g(charset, "charset");
        k0 k0Var = this.r;
        h hVar = this.s;
        hVar.G(k0Var);
        return hVar.h0(charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.t;
    }

    public final int m() {
        C0(4L);
        int readInt = this.s.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // h91.j
    public final String p0() {
        return P(Long.MAX_VALUE);
    }

    @Override // h91.j
    public final long q(k kVar) {
        k71.k.g(kVar, "targetBytes");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        long j = 0;
        while (true) {
            h hVar = this.s;
            long M = hVar.M(j, kVar);
            if (M != -1) {
                return M;
            }
            long j2 = hVar.s;
            if (this.r.U(hVar, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    public final long r() {
        C0(8L);
        long readLong = this.s.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k71.k.g(byteBuffer, "sink");
        h hVar = this.s;
        if (hVar.s == 0 && this.r.U(hVar, 8192L) == -1) {
            return -1;
        }
        return hVar.read(byteBuffer);
    }

    @Override // h91.j
    public final byte readByte() {
        C0(1L);
        return this.s.readByte();
    }

    @Override // h91.j
    public final void readFully(byte[] bArr) {
        h hVar = this.s;
        k71.k.g(bArr, "sink");
        try {
            C0(bArr.length);
            hVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = hVar.s;
                if (j <= 0) {
                    throw e;
                }
                int read = hVar.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // h91.j
    public final int readInt() {
        C0(4L);
        return this.s.readInt();
    }

    @Override // h91.j
    public final long readLong() {
        C0(8L);
        return this.s.readLong();
    }

    @Override // h91.j
    public final short readShort() {
        C0(2L);
        return this.s.readShort();
    }

    @Override // h91.j
    public final boolean request(long j) {
        h hVar;
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        do {
            hVar = this.s;
            if (hVar.s >= j) {
                return true;
            }
        } while (this.r.U(hVar, 8192L) != -1);
        return false;
    }

    @Override // h91.j
    public final long s(i iVar) {
        h hVar;
        long j = 0;
        while (true) {
            k0 k0Var = this.r;
            hVar = this.s;
            if (k0Var.U(hVar, 8192L) == -1) {
                break;
            }
            long A = hVar.A();
            if (A > 0) {
                j += A;
                iVar.I0(hVar, A);
            }
        }
        long j2 = hVar.s;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        iVar.I0(hVar, j2);
        return j3;
    }

    @Override // h91.j
    public final void skip(long j) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            h hVar = this.s;
            if (hVar.s == 0 && this.r.U(hVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, hVar.s);
            hVar.skip(min);
            j -= min;
        }
    }

    public final short t() {
        C0(2L);
        return this.s.e0();
    }

    public final String toString() {
        return "buffer(" + this.r + ')';
    }

    @Override // h91.j
    public final void u0(h hVar, long j) {
        h hVar2 = this.s;
        try {
            C0(j);
            hVar2.u0(hVar, j);
        } catch (EOFException e) {
            hVar.G(hVar2);
            throw e;
        }
    }

    @Override // h91.j
    public final k v(long j) {
        C0(j);
        return this.s.v(j);
    }
}
