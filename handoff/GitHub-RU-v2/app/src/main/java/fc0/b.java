package fc0;

import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.o8;
import hc0.w8;
import hc0.wg;
import hc0.y8;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        db.Companion.getClass();
        aa.r b = v8.l0.b(db.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        aa.x xVar = bb.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        y8.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", v8.l0.b(y8.a), (String) null, rVar, rVar, n);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("DiscussionComment");
        List list = j50.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n2, list);
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.s[]{mVar3, c, new aa.m("discussion", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        w8.Companion.getClass();
        aa.q0 q0Var2 = w8.c;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0.n(new aa.m("comment", q0Var2, (String) null, rVar, rVar, r2));
        hc0.p.Companion.getClass();
        aa.q0 q0Var3 = hc0.p.a;
        k71.k.g(q0Var3, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("addDiscussionComment", q0Var3, (String) null, rVar, no.a.s(wg.b, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("discussionId", new aa.t("discussionId"))))), n3));
    }
}
