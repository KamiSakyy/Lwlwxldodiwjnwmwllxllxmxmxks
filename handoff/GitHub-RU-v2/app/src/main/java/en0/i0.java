package en0;

import gn0.a9;
import gn0.i9;
import gn0.k9;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import gn0.wh;
import gn0.x6;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionComment");
        List list = zf0.c.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("totalCount", v8.l0.b(rb.a), (String) null, rVar, rVar, rVar));
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        i9.Companion.getClass();
        aa.q0 q0Var = i9.c;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        k9.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("comments", v8.l0.b(k9.a), (String) null, rVar, rVar, n2), new aa.m("answer", q0Var, (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r);
        a9.Companion.getClass();
        aa.q0 q0Var2 = a9.l;
        k71.k.g(q0Var2, "type");
        List r5 = x61.l.r(new aa.m[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("comment", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("discussion", q0Var2, (String) null, rVar, rVar, r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        x6.Companion.getClass();
        aa.q0 q0Var3 = x6.a;
        k71.k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("deleteDiscussionComment", q0Var3, (String) null, rVar, no.a.s(wh.G, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r5));
    }
}
