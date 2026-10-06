package rm0;

import java.util.ArrayList;
import jn0.lb0;
import jn0.yf0;
import jo.mi0;
import jo.zd0;
import kc0.h70;
import kc0.yb0;
import u10.j50;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 implements z01.r, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public m2(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.r
    public final y71.i a(ArrayList arrayList) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new bz0.t(in.r.h(this.s.d(new h70(new aa.u0(10), arrayList))), 28), this.t);
            case 1:
                return y71.n1.y(new o3(in.r.h(this.s.d(new zd0(new aa.u0(10), arrayList))), 26), this.t);
            case 2:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new j50(new aa.u0(10), arrayList))), 0), this.t);
            default:
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new lb0(new aa.u0(10), arrayList))), 1), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
