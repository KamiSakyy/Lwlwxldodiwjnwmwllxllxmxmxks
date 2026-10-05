package kz0;

import java.util.List;
import pz0.ba;
import pz0.ja;
import pz0.la;
import pz0.sk;
import pz0.td;
import pz0.u7;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiscussionComment");
        List list = fr0.c.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("totalCount", v8.l0.b(vd.a), (String) null, rVar, rVar, rVar));
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ja.Companion.getClass();
        aa.q0 q0Var = ja.c;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        la.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("comments", v8.l0.b(la.a), (String) null, rVar, rVar, n2), new aa.m("answer", q0Var, (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r);
        ba.Companion.getClass();
        aa.q0 q0Var2 = ba.l;
        k71.k.g(q0Var2, "type");
        List r5 = x61.l.r(new aa.m[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("comment", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("discussion", q0Var2, (String) null, rVar, rVar, r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        u7.Companion.getClass();
        aa.q0 q0Var3 = u7.a;
        k71.k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteDiscussionComment", q0Var3, (String) null, rVar, no.a.s(sk.M, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r5));
    }
}
