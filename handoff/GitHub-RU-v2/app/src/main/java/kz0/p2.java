package kz0;

import java.util.List;
import pz0.c90;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.w80;
import pz0.wk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p2 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        aa.s mVar2 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        List n = sy.d0.n(new aa.m("nodes", v8.l0.a(w80.W), (String) null, rVar, rVar, r2));
        c90.Companion.getClass();
        aa.r b2 = v8.l0.b(c90.a);
        jx.Companion.getClass();
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), sy.d0.n(new aa.m("mentionableUsers", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.B, new aa.u0(new aa.t("first"))), new aa.k(jx.C, new aa.u0(new aa.t("query")))}), n))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        aa.j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new aa.u0(new aa.t("nodeID"))), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
