package w21;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements n, e, d, b {
    public final /* synthetic */ int r;
    public final Executor s;
    public final a t;
    public final o u;

    public /* synthetic */ k(Executor executor, a aVar, o oVar, int i) {
        this.r = i;
        this.s = executor;
        this.t = aVar;
        this.u = oVar;
    }

    @Override // w21.b
    public void a() {
        this.u.n();
    }

    @Override // w21.n
    public final void b(o oVar) {
        switch (this.r) {
            case 0:
                this.s.execute(new com.google.common.util.concurrent.b(this, oVar, false, 26));
                break;
            default:
                this.s.execute(new com.google.common.util.concurrent.b(this, oVar, false, 27));
                break;
        }
    }

    @Override // w21.e
    public void e(Object obj) {
        this.u.m(obj);
    }

    @Override // w21.d
    public void h(Exception exc) {
        this.u.l(exc);
    }



}
