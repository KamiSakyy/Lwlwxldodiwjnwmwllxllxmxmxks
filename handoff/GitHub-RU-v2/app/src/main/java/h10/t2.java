package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.rf0;
import m10.xf0;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        aa.s mVar2 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(rf0.g0), (String) null, rVar, rVar, r2));
        xf0.Companion.getClass();
        aa.r b2 = v8.l0.b(xf0.a);
        i30.Companion.getClass();
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0Shadow.n("Repository"), sy.d0Shadow.n(new aa.m("mentionableUsers", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.y, new aa.u0(new aa.t("first"))), new aa.k(i30.z, new aa.u0(new aa.t("query")))}), n))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("nodeID"))), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
