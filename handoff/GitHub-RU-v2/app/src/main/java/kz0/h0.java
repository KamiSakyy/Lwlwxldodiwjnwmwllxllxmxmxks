package kz0;

import java.util.List;
import pz0.hs;
import pz0.jx;
import pz0.ny;
import pz0.sk;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h0 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", v8.l0.b(ny.e), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        aa.m mVar5 = new aa.m("repository", v8.l0.b(jx.t0), (String) null, rVar, rVar, r2);
        vd.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("number", v8.l0.b(vd.a), (String) null, rVar, rVar, rVar), new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hs.Companion.getClass();
        aa.q0 q0Var = hs.N;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r3));
        pz0.l6.Companion.getClass();
        aa.q0 q0Var2 = pz0.l6.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createPullRequest", q0Var2, (String) null, rVar, no.a.s(sk.F, new aa.u0(x61.x.u(new w61.k("baseRefName", new aa.t("baseRefName")), new w61.k("body", new aa.t("body")), new w61.k("draft", Boolean.FALSE), new w61.k("headRefName", new aa.t("headRefName")), new w61.k("maintainerCanModify", Boolean.TRUE), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("title", new aa.t("title"))))), n));
    }
}
