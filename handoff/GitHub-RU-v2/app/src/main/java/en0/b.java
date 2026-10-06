package en0;

import gn0.a9;
import gn0.i9;
import gn0.k9;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        rb.Companion.getClass();
        aa.r b = v8.l0.b(rb.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        aa.x xVar = pb.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        k9.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", v8.l0.b(k9.a), (String) null, rVar, rVar, n);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("DiscussionComment");
        List list = zf0.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n2, list);
        a9.Companion.getClass();
        aa.q0 q0Var = a9.l;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.s[]{mVar3, c, new aa.m("discussion", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        i9.Companion.getClass();
        aa.q0 q0Var2 = i9.c;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0Shadow.n(new aa.m("comment", q0Var2, (String) null, rVar, rVar, r2));
        gn0.p.Companion.getClass();
        aa.q0 q0Var3 = gn0.p.a;
        k71.k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addDiscussionComment", q0Var3, (String) null, rVar, no.a.s(wh.b, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("discussionId", new aa.t("discussionId"))))), n3));
    }
}
