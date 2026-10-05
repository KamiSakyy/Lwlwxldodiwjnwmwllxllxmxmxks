package en0;

import gn0.a9;
import gn0.hc;
import gn0.ll;
import gn0.pb;
import gn0.qf;
import gn0.rn;
import gn0.sf;
import gn0.tb;
import gn0.yh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "Team", "User"});
        List list = hh0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "MentionableItem", r, list)});
        qf.Companion.getClass();
        aa.x0 x0Var = qf.a;
        List n = sy.d0.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, r2));
        sf.Companion.getClass();
        aa.q0 q0Var = sf.a;
        k71.k.g(q0Var, "type");
        hc.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(hc.l, new aa.u0(new aa.t("first"))), new aa.k(hc.m, new aa.u0(new aa.t("query")))}), n));
        List n3 = sy.d0.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        ll.Companion.getClass();
        List n4 = sy.d0.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ll.s, new aa.u0(new aa.t("first"))), new aa.k(ll.t, new aa.u0(new aa.t("query")))}), n3));
        List n5 = sy.d0.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        a9.Companion.getClass();
        List n6 = sy.d0.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(a9.j, new aa.u0(new aa.t("first"))), new aa.k(a9.k, new aa.u0(new aa.t("query")))}), n5));
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Issue", sy.d0.n("Issue"), n2);
        aa.s nVar2 = new aa.n("PullRequest", sy.d0.n("PullRequest"), n4);
        aa.s nVar3 = new aa.n("Discussion", sy.d0.n("Discussion"), n6);
        pb.Companion.getClass();
        List r3 = x61.l.r(new aa.s[]{mVar2, nVar, nVar2, nVar3, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("nodeID"))), r3));
    }
}
