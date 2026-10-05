package fc0;

import hc0.bb;
import hc0.fb;
import hc0.lk;
import hc0.o8;
import hc0.pm;
import hc0.tb;
import hc0.xe;
import hc0.yg;
import hc0.ze;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "Team", "User"});
        List list = r60.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "MentionableItem", r, list)});
        xe.Companion.getClass();
        aa.x0 x0Var = xe.a;
        List n = sy.d0.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, r2));
        ze.Companion.getClass();
        aa.q0 q0Var = ze.a;
        k71.k.g(q0Var, "type");
        tb.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(tb.l, new aa.u0(new aa.t("first"))), new aa.k(tb.m, new aa.u0(new aa.t("query")))}), n));
        List n3 = sy.d0.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        lk.Companion.getClass();
        List n4 = sy.d0.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(lk.r, new aa.u0(new aa.t("first"))), new aa.k(lk.s, new aa.u0(new aa.t("query")))}), n3));
        List n5 = sy.d0.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        o8.Companion.getClass();
        List n6 = sy.d0.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(o8.j, new aa.u0(new aa.t("first"))), new aa.k(o8.k, new aa.u0(new aa.t("query")))}), n5));
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Issue", sy.d0.n("Issue"), n2);
        aa.s nVar2 = new aa.n("PullRequest", sy.d0.n("PullRequest"), n4);
        aa.s nVar3 = new aa.n("Discussion", sy.d0.n("Discussion"), n6);
        bb.Companion.getClass();
        List r3 = x61.l.r(new aa.s[]{mVar2, nVar, nVar2, nVar3, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        aa.j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new aa.u0(new aa.t("nodeID"))), r3));
    }
}
