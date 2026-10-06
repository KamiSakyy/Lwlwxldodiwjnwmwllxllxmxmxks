package w21;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements n, e, d, b {
    public final /* synthetic */ int r;
    public Executor s;
    public Object t;
    public Object u;

    public l(Executor executor, b bVar) {
        this.r = 0;
        this.t = new Object();
        this.s = executor;
        this.u = bVar;
    }

    @Override // w21.b
    public void a() {
        ((o) this.u).n();
    }

    @Override // w21.n
    public final void b(o oVar) {
        switch (this.r) {
            case 0:
                if (oVar.d) {
                    synchronized (this.t) {
                    }
                    this.s.execute(new t81.d(3, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.t) {
                }
                this.s.execute(new com.google.common.util.concurrent.b(this, oVar, false, 28));
                return;
            case 2:
                if (oVar.j() || oVar.d) {
                    return;
                }
                synchronized (this.t) {
                }
                this.s.execute(new com.google.common.util.concurrent.b(this, oVar, false, 29));
                return;
            case 3:
                if (oVar.j()) {
                    synchronized (this.t) {
                    }
                    this.s.execute(new m(0, this, oVar));
                    return;
                }
                return;
            default:
                this.s.execute(new m(1, this, oVar));
                return;
        }
    }

    @Override // w21.e
    public void e(Object obj) {
        ((o) this.u).m(obj);
    }

    @Override // w21.d
    public void h(Exception exc) {
        ((o) this.u).l(exc);
    }

    public l(Executor executor, c cVar) {
        this.r = 1;
        this.t = new Object();
        this.s = executor;
        this.u = cVar;
    }

    public l(Executor executor, d dVar) {
        this.r = 2;
        this.t = new Object();
        this.s = executor;
        this.u = dVar;
    }

    public l(Executor executor, e eVar) {
        this.r = 3;
        this.t = new Object();
        this.s = executor;
        this.u = eVar;
    }

    public l(Executor executor, f fVar, o oVar) {
        this.r = 4;
        this.s = executor;
        this.t = fVar;
        this.u = oVar;
    }
}
