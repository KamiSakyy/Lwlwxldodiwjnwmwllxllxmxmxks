package rm0;

import jn0.gt;
import jn0.ws;
import jn0.xr;
import jn0.yf0;
import jo.ev;
import jo.mi0;
import jo.uu;
import jo.vt;
import kc0.er;
import kc0.uq;
import kc0.vp;
import kc0.yb0;
import u10.aq;
import u10.qp;
import u10.ro;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c7 implements z01.b1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public c7(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.b1
    public final Object a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new uq(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 11), this.t);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new uu(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 26), this.t);
            case 2:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new qp(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 9), this.t);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new ws(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 29), this.t);
        }
    }

    @Override // z01.b1
    public final Object b(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new er(new aa.u0(str3), str, str2), null, false, null, null, 58), 13), this.t);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new ev(new aa.u0(str3), str, str2), null, false, null, null, 58), 28), this.t);
            case 2:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new aq(new aa.u0(str3), str, str2), null, false, null, null, 58), 11), this.t);
            default:
                return y71.n1.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new gt(new aa.u0(str3), str, str2), null, false, null, null, 58), 1), this.t);
        }
    }

    @Override // z01.b1
    public final y71.i c(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "tagName");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new vp(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 12), this.t);
            case 1:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "tagName");
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new vt(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 27), this.t);
            case 2:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "tagName");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new ro(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 10), this.t);
            default:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "tagName");
                return y71.n1.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new xr(str, str2, str3, new aa.u0(str4)), null, false, null, null, 58), 0), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
