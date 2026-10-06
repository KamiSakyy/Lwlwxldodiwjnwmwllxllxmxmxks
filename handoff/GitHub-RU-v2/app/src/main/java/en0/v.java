package en0;

import gn0.eq;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = v8.l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar2 = new aa.m("url", v8.l0.b(mx.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        aa.q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("repository", q0Var, (String) null, rVar, rVar, r));
        gn0.b3.Companion.getClass();
        aa.q0 q0Var2 = gn0.b3.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("cloneTemplateRepository", q0Var2, (String) null, rVar, no.a.s(wh.r, new aa.u0(x61.x.u(new w61.k("description", new aa.t("description")), new w61.k("includeAllBranches", new aa.t("includeAllBranches")), new w61.k("name", new aa.t("name")), new w61.k("ownerId", new aa.t("ownerId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("visibility", new aa.t("visibility"))))), n));
    }
}
