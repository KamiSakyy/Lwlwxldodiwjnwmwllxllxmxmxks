package fc0;

import hc0.ap;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.m mVar2 = new aa.m("url", v8.l0.b(ew.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        ap.Companion.getClass();
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("repository", q0Var, (String) null, rVar, rVar, r));
        hc0.z2.Companion.getClass();
        aa.q0 q0Var2 = hc0.z2.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("cloneTemplateRepository", q0Var2, (String) null, rVar, no.a.s(wg.r, new aa.u0(x61.x.u(new w61.k("description", new aa.t("description")), new w61.k("includeAllBranches", new aa.t("includeAllBranches")), new w61.k("name", new aa.t("name")), new w61.k("ownerId", new aa.t("ownerId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("visibility", new aa.t("visibility"))))), n));
    }
}
