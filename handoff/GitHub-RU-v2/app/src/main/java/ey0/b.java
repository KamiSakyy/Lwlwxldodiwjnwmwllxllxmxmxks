package ey0;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import java.util.List;
import pz0.lp;
import pz0.o3;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Item");
        List list = jy0.j.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        lp.Companion.getClass();
        q0 q0Var = lp.b;
        k71.k.g(q0Var, "type");
        List n2 = d0Shadow.n(new aa.m("projectV2Item", q0Var, (String) null, rVar, rVar, r));
        o3.Companion.getClass();
        q0 q0Var2 = o3.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new aa.m("clearProjectV2ItemFieldValue", q0Var2, (String) null, rVar, no.a.s(sk.v, new u0(x.u(new w61.k("fieldId", new t("fieldId")), new w61.k("itemId", new t("itemId")), new w61.k("projectId", new t("projectId"))))), n2));
    }
}
