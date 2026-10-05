package fc0;

import hc0.bb;
import hc0.fb;
import hc0.w8;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
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
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("DiscussionComment");
        List list2 = j50.d.a;
        aa.s c2 = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        w8.Companion.getClass();
        aa.q0 q0Var = w8.c;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar2, c2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        hc0.p.Companion.getClass();
        aa.q0 q0Var2 = hc0.p.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("addDiscussionComment", q0Var2, (String) null, rVar, no.a.s(wg.b, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("discussionId", new aa.t("discussionId")), new w61.k("replyToId", new aa.t("parentCommentId"))))), n3));
    }
}
