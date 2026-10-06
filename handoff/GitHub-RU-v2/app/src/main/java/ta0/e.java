package ta0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.dz;
import hc0.fb;
import hc0.wg;
import hc0.yz;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("description", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        q0 q0Var = yz.c;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        dz.Companion.getClass();
        q0 q0Var2 = dz.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0Shadow.n(new m("updateUserList", q0Var2, (String) null, rVar, no.a.s(wg.Z0, new u0(new t("input"))), n));
    }
}
