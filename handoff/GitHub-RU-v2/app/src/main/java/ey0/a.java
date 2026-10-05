package ey0;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import java.util.List;
import pz0.lp;
import pz0.sk;
import pz0.td;
import pz0.x;
import pz0.xd;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = vu0.f.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        lp.Companion.getClass();
        q0 q0Var = lp.b;
        k71.k.g(q0Var, "type");
        List n2 = d0.n(new aa.m("item", q0Var, (String) null, rVar, rVar, r));
        x.Companion.getClass();
        q0 q0Var2 = x.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0.n(new aa.m("addProjectV2ItemById", q0Var2, (String) null, rVar, no.a.s(sk.f, new u0(x61.x.u(new w61.k("contentId", new t("contentId")), new w61.k("projectId", new t("projectId"))))), n2));
    }
}
