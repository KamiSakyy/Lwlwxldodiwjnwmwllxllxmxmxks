package rm0;

import jn0.he0;
import jn0.yf0;
import jo.mi0;
import jo.vg0;
import kc0.ha0;
import kc0.yb0;
import u10.h80;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ca implements z01.m1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;

    public ca(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.m1
    public final Object a(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.s.d(new ha0(str))), 17), this.t);
            case 1:
                return y71.n1Shadow.y(new t00.g3(in.rShadow.h(this.s.d(new vg0(str))), 20), this.t);
            case 2:
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.s.d(new h80(str))), 21), this.t);
            default:
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.h(this.s.d(new he0(str))), 25), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
