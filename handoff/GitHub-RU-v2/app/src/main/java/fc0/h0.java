package fc0;

import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.n6;
import hc0.o8;
import hc0.w8;
import hc0.wg;
import hc0.y8;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiscussionComment");
        List list = j50.c.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("totalCount", v8.l0.b(db.a), (String) null, rVar, rVar, rVar));
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        w8.Companion.getClass();
        aa.q0 q0Var = w8.c;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        y8.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("comments", v8.l0.b(y8.a), (String) null, rVar, rVar, n2), new aa.m("answer", q0Var, (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r);
        o8.Companion.getClass();
        aa.q0 q0Var2 = o8.l;
        k71.k.g(q0Var2, "type");
        List r5 = x61.l.r(new aa.m[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("comment", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("discussion", q0Var2, (String) null, rVar, rVar, r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        n6.Companion.getClass();
        aa.q0 q0Var3 = n6.a;
        k71.k.g(q0Var3, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteDiscussionComment", q0Var3, (String) null, rVar, no.a.s(wg.G, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r5));
    }
}
