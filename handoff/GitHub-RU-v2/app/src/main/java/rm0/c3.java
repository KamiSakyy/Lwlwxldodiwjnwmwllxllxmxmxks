package rm0;

import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 implements z01.v, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;

    public c3(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.v
    public final Object a(String str, String str2, z01.u uVar) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new kc0.w(str, str2))), 29), this.t);
            case 1:
                String str3 = uVar != null ? uVar.c : null;
                aa1.bShadow bVar = aa.t0.d;
                aa1.bShadow u0Var = str3 == null ? bVar : new aa.u0(str3);
                String str4 = uVar != null ? uVar.d : null;
                if (str4 != null) {
                    bVar = new aa.u0(str4);
                }
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.s.d(new jo.b0(u0Var, bVar, str, str2))), 27), this.t);
            case 2:
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.s.d(new u10.w(str, str2))), 1), this.t);
            default:
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.h(this.s.d(new jn0.w(str, str2))), 2), this.t);
        }
    }

    @Override // z01.v
    public final Object b(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new kc0.k8(str)))), this.t);
            case 1:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new jo.ba(str)))), this.t);
            case 2:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new u10.c8(str)))), this.t);
            default:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new jn0.e9(str)))), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
