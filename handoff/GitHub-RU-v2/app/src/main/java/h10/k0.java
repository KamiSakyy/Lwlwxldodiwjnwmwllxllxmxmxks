package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.l40;
import m10.p9;
import m10.ux;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k0 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", v8.l0.b(l40.e), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        aa.m mVar5 = new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r2);
        ch.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("number", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar), new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r3));
        p9.Companion.getClass();
        aa.q0 q0Var2 = p9.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("createPullRequest", q0Var2, (String) null, rVar, no.a.s(vp.I, new aa.u0(x61.x.u(new w61.k[]{new w61.k("baseRefName", new aa.t("baseRefName")), new w61.k("body", new aa.t("body")), new w61.k("draft", Boolean.FALSE), new w61.k("headRefName", new aa.t("headRefName")), new w61.k("maintainerCanModify", Boolean.TRUE), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("title", new aa.t("title"))}))), n));
    }
}
