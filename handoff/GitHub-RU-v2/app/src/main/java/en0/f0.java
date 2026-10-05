package en0;

import gn0.eq;
import gn0.hr;
import gn0.ll;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f0 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.x xVar = pb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", v8.l0.b(hr.a), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        eq.Companion.getClass();
        aa.m mVar5 = new aa.m("repository", v8.l0.b(eq.m0), (String) null, rVar, rVar, r2);
        rb.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("number", v8.l0.b(rb.a), (String) null, rVar, rVar, rVar), new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ll.Companion.getClass();
        aa.q0 q0Var = ll.K;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r3));
        gn0.w5.Companion.getClass();
        aa.q0 q0Var2 = gn0.w5.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("createPullRequest", q0Var2, (String) null, rVar, no.a.s(wh.A, new aa.u0(x61.x.u(new w61.k("baseRefName", new aa.t("baseRefName")), new w61.k("body", new aa.t("body")), new w61.k("draft", Boolean.FALSE), new w61.k("headRefName", new aa.t("headRefName")), new w61.k("maintainerCanModify", Boolean.TRUE), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("title", new aa.t("title"))))), n));
    }
}
