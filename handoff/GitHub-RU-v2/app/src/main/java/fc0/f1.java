package fc0;

import hc0.ap;
import hc0.bb;
import hc0.cw;
import hc0.fb;
import hc0.pm;
import hc0.ra;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("name", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cw.Companion.getClass();
        aa.q0 q0Var = cw.a;
        k71.k.g(q0Var, "type");
        hc0.t3.Companion.getClass();
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Commit", sy.d0.n("Commit"), x61.l.r(new aa.m[]{mVar, new aa.m("file", q0Var, (String) null, rVar, no.a.s(hc0.t3.e, new aa.u0(new aa.t("filePath"))), n)}))});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ra.Companion.getClass();
        aa.j0 j0Var = ra.a;
        k71.k.g(j0Var, "type");
        ap.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("object", j0Var, (String) null, rVar, no.a.s(ap.F, new aa.u0(new aa.t("branchQualifiedName"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("name"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r2));
    }
}
