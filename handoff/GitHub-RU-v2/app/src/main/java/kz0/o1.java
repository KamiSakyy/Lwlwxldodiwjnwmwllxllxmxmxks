package kz0;

import java.util.List;
import pz0.d50;
import pz0.jd;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("name", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        d50.Companion.getClass();
        aa.q0 q0Var = d50.a;
        k71.k.g(q0Var, "type");
        pz0.s4.Companion.getClass();
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Commit", sy.d0.n("Commit"), x61.l.r(new aa.m[]{mVar, new aa.m("file", q0Var, (String) null, rVar, no.a.s(pz0.s4.e, new aa.u0(new aa.t("filePath"))), n)}))});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        jd.Companion.getClass();
        aa.j0 j0Var = jd.a;
        k71.k.g(j0Var, "type");
        jx.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("object", j0Var, (String) null, rVar, no.a.s(jx.J, new aa.u0(new aa.t("branchQualifiedName"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("name"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
