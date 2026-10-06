package fc0;

import hc0.ap;
import hc0.bb;
import hc0.dq;
import hc0.fb;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z3 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Organization", "Repository", "User"});
        List list = w70.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "ProjectOwner", r, list)});
        dq.Companion.getClass();
        aa.m mVar2 = new aa.m("owner", v8.l0.b(dq.a), (String) null, rVar, rVar, r2);
        bb.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ap.Companion.getClass();
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repo"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r3));
    }
}
