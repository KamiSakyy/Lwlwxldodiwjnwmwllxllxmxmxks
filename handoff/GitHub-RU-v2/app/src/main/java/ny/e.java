package ny;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.fg0;
import m10.kf0;
import m10.vp;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("description", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        q0 q0Var = fg0.c;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        kf0.Companion.getClass();
        q0 q0Var2 = kf0.a;
        k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("updateUserList", q0Var2, (String) null, rVar, no.a.s(vp.x1, new u0(new t("input"))), n));
    }
}
