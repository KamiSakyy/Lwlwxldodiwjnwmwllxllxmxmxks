package kz0;

import java.util.List;
import pz0.ba;
import pz0.ci;
import pz0.ei;
import pz0.hs;
import pz0.le;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o2 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "Team", "User"});
        List list = rs0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "MentionableItem", r, list)});
        ci.Companion.getClass();
        aa.x0 x0Var = ci.a;
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, r2));
        ei.Companion.getClass();
        aa.q0 q0Var = ei.a;
        k71.k.g(q0Var, "type");
        le.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(le.l, new aa.u0(new aa.t("first"))), new aa.k(le.m, new aa.u0(new aa.t("query")))}), n));
        List n3 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        hs.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(hs.s, new aa.u0(new aa.t("first"))), new aa.k(hs.t, new aa.u0(new aa.t("query")))}), n3));
        List n5 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        ba.Companion.getClass();
        List n6 = sy.d0Shadow.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ba.j, new aa.u0(new aa.t("first"))), new aa.k(ba.k, new aa.u0(new aa.t("query")))}), n5));
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Issue", sy.d0Shadow.n("Issue"), n2);
        aa.s nVar2 = new aa.n("PullRequest", sy.d0Shadow.n("PullRequest"), n4);
        aa.s nVar3 = new aa.n("Discussion", sy.d0Shadow.n("Discussion"), n6);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, nVar, nVar2, nVar3, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        aa.j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new aa.u0(new aa.t("nodeID"))), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
