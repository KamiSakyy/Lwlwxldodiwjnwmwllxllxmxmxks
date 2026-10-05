package h91;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends InputStream {
    public final /* synthetic */ int r;
    public final /* synthetic */ j s;

    public /* synthetic */ g(j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    private final void f() {
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        switch (this.r) {
            case 0:
                min = Math.min(((h) this.s).s, Integer.MAX_VALUE);
                break;
            default:
                e0 e0Var = (e0) this.s;
                if (!e0Var.t) {
                    min = Math.min(e0Var.s.s, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.r) {
            case 0:
                break;
            default:
                ((e0) this.s).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.r) {
            case 0:
                h hVar = (h) this.s;
                if (hVar.s > 0) {
                    return hVar.readByte() & 255;
                }
                return -1;
            default:
                e0 e0Var = (e0) this.s;
                h hVar2 = e0Var.s;
                if (e0Var.t) {
                    throw new IOException("closed");
                }
                if (hVar2.s == 0 && e0Var.r.U(hVar2, 8192L) == -1) {
                    return -1;
                }
                return hVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.r) {
            case 0:
                return ((h) this.s) + ".inputStream()";
            default:
                return ((e0) this.s) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.r) {
            case 1:
                k71.k.g(outputStream, "out");
                e0 e0Var = (e0) this.s;
                h hVar = e0Var.s;
                if (e0Var.t) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j2 = 0;
                while (true) {
                    if (hVar.s == j && e0Var.r.U(hVar, 8192L) == -1) {
                        return j2;
                    }
                    long j3 = hVar.s;
                    j2 += j3;
                    b.e(j3, 0L, j3);
                    f0 f0Var = hVar.r;
                    while (j3 > j) {
                        k71.k.d(f0Var);
                        int min = (int) Math.min(j3, f0Var.c - f0Var.b);
                        outputStream.write(f0Var.a, f0Var.b, min);
                        int i = f0Var.b + min;
                        f0Var.b = i;
                        long j4 = min;
                        hVar.s -= j4;
                        j3 -= j4;
                        if (i == f0Var.c) {
                            f0 a = f0Var.a();
                            hVar.r = a;
                            g0.a(f0Var);
                            f0Var = a;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.r) {
            case 0:
                k71.k.g(bArr, "sink");
                return ((h) this.s).read(bArr, i, i2);
            default:
                k71.k.g(bArr, "data");
                e0 e0Var = (e0) this.s;
                h hVar = e0Var.s;
                if (!e0Var.t) {
                    b.e(bArr.length, i, i2);
                    if (hVar.s == 0 && e0Var.r.U(hVar, 8192L) == -1) {
                        return -1;
                    }
                    return hVar.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
