package h10;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.i30;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.m mVar2 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        aa.q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("repository", q0Var, (String) null, rVar, rVar, r));
        m10.n4.Companion.getClass();
        aa.q0 q0Var2 = m10.n4.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("cloneTemplateRepository", q0Var2, (String) null, rVar, no.a.s(vp.x, new aa.u0(x61.x.u(new w61.k[]{new w61.k("description", new aa.t("description")), new w61.k("includeAllBranches", new aa.t("includeAllBranches")), new w61.k("name", new aa.t("name")), new w61.k("ownerId", new aa.t("ownerId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("visibility", new aa.t("visibility"))}))), n));
    }
}
