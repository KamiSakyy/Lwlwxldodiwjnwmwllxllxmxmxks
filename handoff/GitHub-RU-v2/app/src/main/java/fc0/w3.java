package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.jn;
import hc0.ln;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w3 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Ref");
        List list = v80.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "Ref", n, list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jn.Companion.getClass();
        aa.q0 q0Var = jn.b;
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(q0Var), (String) null, rVar, rVar, r2));
        aa.m mVar3 = new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r);
        ln.Companion.getClass();
        aa.q0 q0Var2 = ln.a;
        k71.k.g(q0Var2, "type");
        ap.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("refs", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.R, new aa.u0(50)), new aa.k(ap.S, new aa.u0(new aa.t("query"))), new aa.k(ap.T, new aa.u0(new aa.t("refPrefix")))}), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = ap.k0;
        k71.k.g(q0Var3, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repo"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r3));
    }
}
