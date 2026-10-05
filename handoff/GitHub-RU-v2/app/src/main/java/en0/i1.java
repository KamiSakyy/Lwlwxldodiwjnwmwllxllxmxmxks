package en0;

import gn0.eq;
import gn0.fb;
import gn0.ix;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("name", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ix.Companion.getClass();
        aa.q0 q0Var = ix.a;
        k71.k.g(q0Var, "type");
        gn0.d4.Companion.getClass();
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Commit", sy.d0.n("Commit"), x61.l.r(new aa.m[]{mVar, new aa.m("file", q0Var, (String) null, rVar, no.a.s(gn0.d4.e, new aa.u0(new aa.t("filePath"))), n)}))});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.j0 j0Var = fb.a;
        k71.k.g(j0Var, "type");
        eq.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("object", j0Var, (String) null, rVar, no.a.s(eq.G, new aa.u0(new aa.t("branchQualifiedName"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = eq.m0;
        k71.k.g(q0Var2, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r2));
    }
}
