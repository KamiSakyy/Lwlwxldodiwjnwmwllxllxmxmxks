package en0;

import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.y00;
import gn0.yh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        aa.s mVar2 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(s00.P), (String) null, rVar, rVar, r2));
        y00.Companion.getClass();
        aa.r b2 = v8.l0.b(y00.a);
        eq.Companion.getClass();
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0Shadow.n("Repository"), sy.d0Shadow.n(new aa.m("mentionableUsers", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.y, new aa.u0(new aa.t("first"))), new aa.k(eq.z, new aa.u0(new aa.t("query")))}), n))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("nodeID"))), r3));
    }
}
