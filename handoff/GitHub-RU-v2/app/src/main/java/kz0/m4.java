package kz0;

import java.util.List;
import pz0.jx;
import pz0.mv;
import pz0.ov;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m4 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = ru0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "Ref", n, list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mv.Companion.getClass();
        aa.q0 q0Var = mv.e;
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(q0Var), (String) null, rVar, rVar, r2));
        aa.m mVar3 = new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r);
        ov.Companion.getClass();
        aa.q0 q0Var2 = ov.a;
        k71.k.g(q0Var2, "type");
        jx.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("refs", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.Z, new aa.u0(50)), new aa.k(jx.a0, new aa.u0(new aa.t("query"))), new aa.k(jx.b0, new aa.u0(new aa.t("refPrefix")))}), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repo"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
