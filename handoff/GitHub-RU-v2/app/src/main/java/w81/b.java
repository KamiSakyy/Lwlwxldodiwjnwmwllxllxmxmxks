package w81;

import h91.d0;
import h91.h;
import h91.i0Shadow;
import h91.m0;
import h91.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b implements i0 {
    public final r r;
    public boolean s;
    public final /* synthetic */ f t;

    public b(f fVar) {
        this.t = fVar;
        this.r = new r(((d0) fVar.c.u).r.b());
    }

    @Override // h91.i0Shadow
    public final void I0(h hVar, long j) {
        if (this.s) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        d0 d0Var = (d0) this.t.c.u;
        if (d0Var.t) {
            throw new IllegalStateException("closed");
        }
        d0Var.s.L0(j);
        d0Var.f();
        d0Var.d0("\r\n");
        d0Var.I0(hVar, j);
        d0Var.d0("\r\n");
    }

    @Override // h91.i0Shadow
    public final m0 b() {
        return this.r;
    }

    @Override // h91.i0Shadow, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.s) {
            return;
        }
        this.s = true;
        ((d0) this.t.c.u).d0("0\r\n\r\n");
        r rVar = this.r;
        m0 m0Var = rVar.e;
        rVar.e = m0.d;
        m0Var.a();
        m0Var.b();
        this.t.d = 3;
    }

    @Override // h91.i0Shadow, java.io.Flushable
    public final synchronized void flush() {
        if (this.s) {
            return;
        }
        ((d0) this.t.c.u).flush();
    }
    public Object c = null;
    public Object d = null;
}
