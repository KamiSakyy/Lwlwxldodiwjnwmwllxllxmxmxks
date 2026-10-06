package en0;

import gn0.i9;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
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
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("DiscussionComment");
        List list2 = zf0.d.a;
        aa.s c2 = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        i9.Companion.getClass();
        aa.q0 q0Var = i9.c;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0Shadow.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar2, c2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        gn0.p.Companion.getClass();
        aa.q0 q0Var2 = gn0.p.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addDiscussionComment", q0Var2, (String) null, rVar, no.a.s(wh.b, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("discussionId", new aa.t("discussionId")), new w61.k("replyToId", new aa.t("parentCommentId"))))), n3));
    }
}
