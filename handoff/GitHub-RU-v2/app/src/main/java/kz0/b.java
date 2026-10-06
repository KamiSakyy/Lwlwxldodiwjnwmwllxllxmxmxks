package kz0;

import java.util.List;
import pz0.ba;
import pz0.ja;
import pz0.la;
import pz0.sk;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.r b = v8.l0.b(vd.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        la.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", v8.l0.b(la.a), (String) null, rVar, rVar, n);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("DiscussionComment");
        List list = fr0.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n2, list);
        ba.Companion.getClass();
        aa.q0 q0Var = ba.l;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.s[]{mVar3, c, new aa.m("discussion", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ja.Companion.getClass();
        aa.q0 q0Var2 = ja.c;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0Shadow.n(new aa.m("comment", q0Var2, (String) null, rVar, rVar, r2));
        pz0.p.Companion.getClass();
        aa.q0 q0Var3 = pz0.p.a;
        k71.k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addDiscussionComment", q0Var3, (String) null, rVar, no.a.s(sk.b, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("discussionId", new aa.t("discussionId"))))), n3));
    }
}
