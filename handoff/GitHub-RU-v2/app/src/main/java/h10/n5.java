package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.mr;
import m10.p00;
import m10.t80;
import m10.wg;
import m10.x80;
import m10.z80;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n5 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.r b = v8.l0.b(wg.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = rx.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        List n2 = sy.d0Shadow.n("Organization");
        List list2 = uu.c.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, no.a.c(list2, "selections", "Organization", n2, list2)});
        t80.Companion.getClass();
        aa.m mVar3 = new aa.m("sponsorable", v8.l0.b(t80.c), (String) null, rVar, rVar, r2);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        x80.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(x80.a), (String) null, rVar, rVar, r3)});
        z80.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Sponsorable", x61.l.r(new String[]{"Organization", "User"}), sy.d0Shadow.n(new aa.m("sponsorshipsAsSponsor", v8.l0.b(z80.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(t80.a, new aa.u0(new aa.t("after"))), new aa.k(t80.b, new aa.u0(new aa.t("first")))}), r4))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("id"))), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
