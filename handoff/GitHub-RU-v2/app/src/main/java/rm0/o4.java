package rm0;

import jn0.f80;
import jn0.wi;
import jn0.yf0;
import jo.bk;
import jo.mi0;
import jo.ta0;
import kc0.fh;
import kc0.i40;
import kc0.yb0;
import u10.dg;
import u10.k20;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 implements z01.k0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.bShadow s;
    public final v71.v t;

    public o4(com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.k0
    public final Object a(String str) {
        switch (this.r) {
            case 0:
                k71.w wVar = new k71.w();
                return y71.n1.y(new y(new y00.l(new y71.y(in.r.h(new y71.y(new l4(wVar, this, str, null, 1), this.s.d(new i40(str)))), new m4(wVar, this, str, null, 1)), 10), 22), this.t);
            case 1:
                k71.w wVar2 = new k71.w();
                return y71.n1.y(new t00.w3(new y00.l(new y71.y(in.r.h(new y71.y(new t00.a4(wVar2, this, str, (a71.c) null, 1), this.s.d(new ta0(str)))), new t00.b4(wVar2, this, str, (a71.c) null, 1)), 10), 2), this.t);
            case 2:
                k71.w wVar3 = new k71.w();
                return y71.n1.y(new vb0.u(new y00.l(new y71.y(in.r.h(new y71.y(new vb0.f3(wVar3, this, str, null, 1), this.s.d(new k20(str)))), new vb0.g3(wVar3, this, str, null, 1)), 10), 21), this.t);
            default:
                k71.w wVar4 = new k71.w();
                return y71.n1.y(new vb0.s7(new y00.l(new y71.y(in.r.h(new y71.y(new wy0.k3(wVar4, this, str, null, 1), this.s.d(new f80(str)))), new wy0.l3(wVar4, this, str, null, 1)), 10), 28), this.t);
        }
    }

    @Override // z01.k0
    public final Object b(String str) {
        switch (this.r) {
            case 0:
                k71.w wVar = new k71.w();
                return y71.n1.y(new y(new y00.l(new y71.y(in.r.h(new y71.y(new l4(wVar, this, str, null, 0), this.s.d(new fh(str)))), new m4(wVar, this, str, null, 0)), 10), 21), this.t);
            case 1:
                k71.w wVar2 = new k71.w();
                return y71.n1.y(new t00.w3(new y00.l(new y71.y(in.r.h(new y71.y(new t00.a4(wVar2, this, str, (a71.c) null, 0), this.s.d(new bk(str)))), new t00.b4(wVar2, this, str, (a71.c) null, 0)), 10), 1), this.t);
            case 2:
                k71.w wVar3 = new k71.w();
                return y71.n1.y(new vb0.u(new y00.l(new y71.y(in.r.h(new y71.y(new vb0.f3(wVar3, this, str, null, 0), this.s.d(new dg(str)))), new vb0.g3(wVar3, this, str, null, 0)), 10), 20), this.t);
            default:
                k71.w wVar4 = new k71.w();
                return y71.n1.y(new vb0.s7(new y00.l(new y71.y(in.r.h(new y71.y(new wy0.k3(wVar4, this, str, null, 0), this.s.d(new wi(str)))), new wy0.l3(wVar4, this, str, null, 0)), 10), 27), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
