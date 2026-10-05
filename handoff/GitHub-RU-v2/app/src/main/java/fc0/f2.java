package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.kz;
import hc0.pm;
import hc0.qz;
import hc0.yg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        aa.s mVar2 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        List n = sy.d0.n(new aa.m("nodes", v8.l0.a(kz.O), (String) null, rVar, rVar, r2));
        qz.Companion.getClass();
        aa.r b2 = v8.l0.b(qz.a);
        ap.Companion.getClass();
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), sy.d0.n(new aa.m("mentionableUsers", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.y, new aa.u0(new aa.t("first"))), new aa.k(ap.z, new aa.u0(new aa.t("query")))}), n))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        aa.j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new aa.u0(new aa.t("nodeID"))), r3));
    }
}
