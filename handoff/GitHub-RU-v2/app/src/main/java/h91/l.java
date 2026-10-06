package h91;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class l implements i0Shadow {
    public final /* synthetic */ int r = 0;
    public boolean s;
    public Object t;
    public Object u;

    public l(h hVar, Deflater deflater) {
        this.t = b.b(hVar);
        this.u = deflater;
    }

    @Override // h91.i0Shadow
    public final void I0(h hVar, long j) {
        switch (this.r) {
            case 0:
                Deflater deflater = (Deflater) this.u;
                b.e(hVar.s, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    f0 f0Var = hVar.r;
                    k71.k.d(f0Var);
                    int min = (int) Math.min(j2, f0Var.c - f0Var.b);
                    deflater.setInput(f0Var.a, f0Var.b, min);
                    f(false);
                    long j3 = min;
                    hVar.s -= j3;
                    int i = f0Var.b + min;
                    f0Var.b = i;
                    if (i == f0Var.c) {
                        hVar.r = f0Var.a();
                        g0.a(f0Var);
                    }
                    j2 -= j3;
                }
                deflater.setInput(i91.b.b, 0, 0);
                return;
            default:
                if (this.s) {
                    throw new IllegalStateException("closed");
                }
                r81.e.a(hVar.s, 0L, j);
                ((d0) ((w81.f) this.u).c.u).I0(hVar, j);
                return;
        }
    }

    @Override // h91.i0Shadow
    public final m0 b() {
        switch (this.r) {
            case 0:
                return ((d0) this.t).r.b();
            default:
                return (r) this.t;
        }
    }

    @Override // h91.i0Shadow, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        Object th = null;
        switch (this.r) {
            case 0:
                Deflater deflater = (Deflater) this.u;
                if (this.s) {
                    return;
                }
                try {
                    deflater.finish();
                    f(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((d0) this.t).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.s = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                w81.f fVar = (w81.f) this.u;
                if (this.s) {
                    return;
                }
                this.s = true;
                r rVar = (r) this.t;
                m0 m0Var = rVar.e;
                rVar.e = m0.d;
                m0Var.a();
                m0Var.b();
                fVar.d = 3;
                return;
        }
    }

    public void f(boolean z) {
        f0 x0;
        int deflate;
        Deflater deflater = (Deflater) this.u;
        d0 d0Var = (d0) this.t;
        h hVar = d0Var.s;
        while (true) {
            x0 = hVar.x0(1);
            byte[] bArr = x0.a;
            if (z) {
                try {
                    int i = x0.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = x0.c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (deflate > 0) {
                x0.c += deflate;
                hVar.s += deflate;
                d0Var.f();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (x0.b == x0.c) {
            hVar.r = x0.a();
            g0.a(x0);
        }
    }

    @Override // h91.i0Shadow, java.io.Flushable
    public final void flush() {
        switch (this.r) {
            case 0:
                f(true);
                ((d0) this.t).flush();
                break;
            default:
                if (!this.s) {
                    ((d0) ((w81.f) this.u).c.u).flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.r) {
            case 0:
                return "DeflaterSink(" + ((d0) this.t) + ')';
            default:
                return super.toString();
        }
    }

    public l(w81.f fVar) {
        this.u = fVar;
        this.t = new r(((d0) fVar.c.u).r.b());
    }
}
