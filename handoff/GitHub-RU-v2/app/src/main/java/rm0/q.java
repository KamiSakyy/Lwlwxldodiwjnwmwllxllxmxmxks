package rm0;

import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements z01.e, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;
    public wn.bShadow u;

    public q(com.github.service.wrapper.j jVar, v71.v vVar, wn.bShadow bVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(bVar, "capabilityMapper");
                this.s = jVar;
                this.t = vVar;
                this.u = bVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(bVar, "capabilityMapper");
                this.s = jVar;
                this.t = vVar;
                this.u = bVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(bVar, "capabilityMapper");
                this.s = jVar;
                this.t = vVar;
                this.u = bVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(bVar, "capabilityMapper");
                this.s = jVar;
                this.t = vVar;
                this.u = bVar;
                break;
        }
    }

    @Override // z01.e
    public final Object a() {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new a61.l0(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.q3(), null, false, null, null, 58), 10), this, 29), this.t);
            case 1:
                return y71.n1Shadow.y(new r3Shadow(5, new y00.l(com.github.service.wrapper.a.o(this.s, new jo.e4(), null, false, null, null, 58), 10), this), this.t);
            case 2:
                return y71.n1Shadow.y(new r3Shadow(10, new y00.l(com.github.service.wrapper.a.o(this.s, new u10.q3(), null, false, null, null, 58), 10), this), this.t);
            default:
                return y71.n1Shadow.y(new r3Shadow(13, new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.w3(), null, false, null, null, 58), 10), this), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
