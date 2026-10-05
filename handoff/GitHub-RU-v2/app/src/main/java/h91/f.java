package h91;

import com.github.rudroid.copilot.h1;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f implements Closeable {
    public h r;
    public boolean s;
    public f0 t;
    public byte[] v;
    public long u = -1;
    public int w = -1;
    public int x = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.r = null;
        this.t = null;
        this.u = -1L;
        this.v = null;
        this.w = -1;
        this.x = -1;
    }

    public final void f(long j) {
        h hVar = this.r;
        if (hVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.s) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = hVar.s;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(h1.m("newSize < 0: ", j).toString());
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                f0 f0Var = hVar.r;
                k71.k.d(f0Var);
                f0 f0Var2 = f0Var.g;
                k71.k.d(f0Var2);
                int i = f0Var2.c;
                long j4 = i - f0Var2.b;
                if (j4 > j3) {
                    f0Var2.c = i - ((int) j3);
                    break;
                } else {
                    hVar.r = f0Var2.a();
                    g0.a(f0Var2);
                    j3 -= j4;
                }
            }
            this.t = null;
            this.u = j;
            this.v = null;
            this.w = -1;
            this.x = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                f0 x0 = hVar.x0(i2);
                int min = (int) Math.min(j5, 8192 - x0.c);
                int i3 = x0.c + min;
                x0.c = i3;
                j5 -= min;
                if (z) {
                    this.t = x0;
                    this.u = j2;
                    this.v = x0.a;
                    this.w = i3 - min;
                    this.x = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        hVar.s = j;
    }

    public final int m(long j) {
        h hVar = this.r;
        if (hVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = hVar.s;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.t = null;
                    this.u = j;
                    this.v = null;
                    this.w = -1;
                    this.x = -1;
                    return -1;
                }
                f0 f0Var = hVar.r;
                f0 f0Var2 = this.t;
                long j3 = 0;
                if (f0Var2 != null) {
                    long j4 = this.u - (this.w - f0Var2.b);
                    if (j4 > j) {
                        f0Var2 = f0Var;
                        f0Var = f0Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    f0Var2 = f0Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        k71.k.d(f0Var2);
                        long j5 = (f0Var2.c - f0Var2.b) + j3;
                        if (j < j5) {
                            break;
                        }
                        f0Var2 = f0Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        k71.k.d(f0Var);
                        f0Var = f0Var.g;
                        k71.k.d(f0Var);
                        j2 -= f0Var.c - f0Var.b;
                    }
                    f0Var2 = f0Var;
                    j3 = j2;
                }
                if (this.s) {
                    k71.k.d(f0Var2);
                    if (f0Var2.d) {
                        byte[] bArr = f0Var2.a;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        k71.k.f(copyOf, "copyOf(...)");
                        f0 f0Var3 = new f0(copyOf, f0Var2.b, f0Var2.c, false, true);
                        if (hVar.r == f0Var2) {
                            hVar.r = f0Var3;
                        }
                        f0Var2.b(f0Var3);
                        f0 f0Var4 = f0Var3.g;
                        k71.k.d(f0Var4);
                        f0Var4.a();
                        f0Var2 = f0Var3;
                    }
                }
                this.t = f0Var2;
                this.u = j;
                k71.k.d(f0Var2);
                this.v = f0Var2.a;
                int i = f0Var2.b + ((int) (j - j3));
                this.w = i;
                int i2 = f0Var2.c;
                this.x = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + hVar.s);
    }
}
