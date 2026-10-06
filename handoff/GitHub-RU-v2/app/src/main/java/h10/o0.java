package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.fd;
import m10.nd;
import m10.pd;
import m10.vp;
import m10.ya;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionComment");
        List list = ns.c.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("totalCount", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar));
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        nd.Companion.getClass();
        aa.q0 q0Var = nd.c;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("comments", v8.l0.b(pd.a), (String) null, rVar, rVar, n2), new aa.m("answer", q0Var, (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r);
        fd.Companion.getClass();
        aa.q0 q0Var2 = fd.l;
        k71.k.g(q0Var2, "type");
        List r5 = x61.l.r(new aa.m[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("comment", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("discussion", q0Var2, (String) null, rVar, rVar, r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        ya.Companion.getClass();
        aa.q0 q0Var3 = ya.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("deleteDiscussionComment", q0Var3, (String) null, rVar, no.a.s(vp.P, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r5));
    }
}
