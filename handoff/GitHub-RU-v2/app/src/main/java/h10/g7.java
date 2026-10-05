package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fg0;
import m10.hg0;
import m10.ng0;
import m10.p00;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g7 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("name", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("UserList");
        List list = rx.g.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "UserList", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(fg0.c), (String) null, rVar, rVar, r2));
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar4 = new aa.m("hasCreatedLists", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        ng0.Companion.getClass();
        aa.m mVar5 = new aa.m("suggestedListNames", no.a.d(ng0.a), (String) null, rVar, rVar, r);
        hg0.Companion.getClass();
        aa.r b = v8.l0.b(hg0.a);
        rf0.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("lists", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.m, new aa.u0(new aa.t("after"))), new aa.k(rf0.n, new aa.u0(new aa.t("first")))}), n2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("user", q0Var, (String) null, rVar, no.a.s(p00.E, new aa.u0(new aa.t("login"))), r3), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
