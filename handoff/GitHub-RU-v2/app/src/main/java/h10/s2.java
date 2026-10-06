package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.gm;
import m10.im;
import m10.p00;
import m10.ux;
import m10.wh;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "Team", "User"});
        List list = au.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "MentionableItem", r, list)});
        gm.Companion.getClass();
        aa.x0 x0Var = gm.a;
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, r2));
        im.Companion.getClass();
        aa.q0 q0Var = im.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(wh.l, new aa.u0(new aa.t("first"))), new aa.k(wh.m, new aa.u0(new aa.t("query")))}), n));
        List n3 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        ux.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ux.t, new aa.u0(new aa.t("first"))), new aa.k(ux.u, new aa.u0(new aa.t("query")))}), n3));
        List n5 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("MentionableItem", x61.l.r(new String[]{"Bot", "Team", "User"}), list)})));
        fd.Companion.getClass();
        List n6 = sy.d0Shadow.n(new aa.m("mentionableItems", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(fd.j, new aa.u0(new aa.t("first"))), new aa.k(fd.k, new aa.u0(new aa.t("query")))}), n5));
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Issue", sy.d0Shadow.n("Issue"), n2);
        aa.s nVar2 = new aa.n("PullRequest", sy.d0Shadow.n("PullRequest"), n4);
        aa.s nVar3 = new aa.n("Discussion", sy.d0Shadow.n("Discussion"), n6);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, nVar, nVar2, nVar3, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("nodeID"))), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
