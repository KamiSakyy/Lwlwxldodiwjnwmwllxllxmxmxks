package rm0;

import jn0.mi;
import jn0.yf0;
import jo.jj;
import jo.mi0;
import kc0.vg;
import kc0.yb0;
import u10.tf;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aa implements z01.l1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public aa(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.l1
    public final Object a(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new vg(str, str2), null, false, null, null, 58), 10), 1), this.t);
            case 1:
                return y71.n1.y(new t00.q6(new y00.l(com.github.service.wrapper.a.o(this.s, new jj(str, str2), null, false, null, null, 58), 10), 17), this.t);
            case 2:
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new tf(str, str2), null, false, null, null, 58), 10), 28), this.t);
            default:
                return y71.n1.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new mi(str, str2), null, false, null, null, 58), 10), 11), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }





}
