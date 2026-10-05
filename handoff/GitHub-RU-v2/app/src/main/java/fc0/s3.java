package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.jn;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s3 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = v80.a.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jn.Companion.getClass();
        aa.q0 q0Var = jn.b;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ap.Companion.getClass();
        aa.q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repo"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r2));
    }
}
