package w21;

import java.util.concurrent.ExecutionException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements e, d, b {
    public final Object r = new Object();
    public final int s;
    public final o t;
    public int u;
    public int v;
    public int w;
    public Exception x;
    public boolean y;

    public j(int i, o oVar) {
        this.s = i;
        this.t = oVar;
    }

    @Override // w21.b
    public final void a() {
        synchronized (this.r) {
            this.w++;
            this.y = true;
            b();
        }
    }

    public final void b() {
        int i = this.u + this.v + this.w;
        int i2 = this.s;
        if (i == i2) {
            Exception exc = this.x;
            o oVar = this.t;
            if (exc == null) {
                if (this.y) {
                    oVar.n();
                    return;
                } else {
                    oVar.m(null);
                    return;
                }
            }
            oVar.l(new ExecutionException(this.v + " out of " + i2 + " underlying tasks failed", this.x));
        }
    }

    @Override // w21.e
    public final void e(Object obj) {
        synchronized (this.r) {
            this.u++;
            b();
        }
    }

    @Override // w21.d
    public final void h(Exception exc) {
        synchronized (this.r) {
            this.v++;
            this.x = exc;
            b();
        }
    }
}
