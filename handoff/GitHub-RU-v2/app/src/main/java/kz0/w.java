package kz0;

import java.util.List;
import pz0.h50;
import pz0.jx;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = v8.l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar2 = new aa.m("url", v8.l0.b(h50.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xd.a), (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        aa.q0 q0Var = jx.t0;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("repository", q0Var, (String) null, rVar, rVar, r));
        pz0.q3.Companion.getClass();
        aa.q0 q0Var2 = pz0.q3.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("cloneTemplateRepository", q0Var2, (String) null, rVar, no.a.s(sk.w, new aa.u0(x61.x.u(new w61.k("description", new aa.t("description")), new w61.k("includeAllBranches", new aa.t("includeAllBranches")), new w61.k("name", new aa.t("name")), new w61.k("ownerId", new aa.t("ownerId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("visibility", new aa.t("visibility"))))), n));
    }
}
