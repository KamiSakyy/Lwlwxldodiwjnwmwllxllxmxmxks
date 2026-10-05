package rm0;

import jn0.cm;
import jn0.vl;
import jn0.yf0;
import jo.an;
import jo.hn;
import jo.mi0;
import kc0.ek;
import kc0.lk;
import kc0.yb0;
import u10.cj;
import u10.jj;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 implements z01.m0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public r4(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.m0
    public final y71.i a(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "nodeId");
                k71.k.g(str3, "repositoryId");
                break;
            case 1:
                k71.k.g(str2, "nodeId");
                k71.k.g(str3, "repositoryId");
                break;
            case 2:
                k71.k.g(str2, "nodeId");
                k71.k.g(str3, "repositoryId");
                break;
            default:
                k71.k.g(str2, "nodeId");
                k71.k.g(str3, "repositoryId");
                break;
        }
        return b(str, str2);
    }

    @Override // z01.m0
    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new ek(new aa.u0(str), str2), null, false, null, null, 58), 10), 23), this.t);
            case 1:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new an(new aa.u0(str), str2), null, false, null, null, 58), 10), 3), this.t);
            case 2:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new cj(new aa.u0(str), str2), null, false, null, null, 58), 10), 22), this.t);
            default:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new vl(new aa.u0(str), str2), null, false, null, null, 58), 10), 29), this.t);
        }
    }

    @Override // z01.m0
    public final y71.i c(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new lk(new aa.u0(str), str2), null, false, null, null, 58), 10), 24), this.t);
            case 1:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new hn(new aa.u0(str), str2), null, false, null, null, 58), 10), 4), this.t);
            case 2:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new jj(new aa.u0(str), str2), null, false, null, null, 58), 10), 23), this.t);
            default:
                k71.k.g(str2, "nodeId");
                return y71.n1.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new cm(new aa.u0(str), str2), null, false, null, null, 58), 10), 0), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
