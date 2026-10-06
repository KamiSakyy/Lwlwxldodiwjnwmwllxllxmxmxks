package rm0;

import jn0.qe0;
import jn0.xf0;
import jn0.yf0;
import jo.eh0;
import jo.li0;
import jo.mi0;
import kc0.qa0;
import kc0.xb0;
import kc0.yb0;
import u10.q80;
import u10.x90;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ma implements z01.p1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;

    public ma(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.p1
    public final Object a() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new qa0(), null, false, null, null, 58), 27), this.t);
            case 1:
                return y71.n1.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new eh0(), null, false, null, null, 58), 14), this.t);
            case 2:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new q80(), null, false, null, null, 58), 22), this.t);
            default:
                return y71.n1.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new qe0(), null, false, null, null, 58), 17), this.t);
        }
    }

    @Override // z01.p1
    public final Object b() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new xb0(), null, false, null, null, 58), 26), this.t);
            case 1:
                return y71.n1.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new li0(), null, false, null, null, 58), 13), this.t);
            case 2:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new x90(), null, false, null, null, 58), 21), this.t);
            default:
                return y71.n1.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new xf0(), null, false, null, null, 58), 16), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
