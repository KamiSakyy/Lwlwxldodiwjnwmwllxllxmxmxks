package fc0;

import hc0.ap;
import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.o8;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = f50.c.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Discussion", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Discussion", sy.d0.n("Discussion"), r);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, nVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        ap.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("discussion", q0Var, (String) null, rVar, no.a.s(ap.i, new aa.u0(new aa.t("discussionNumber"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var2, (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        di.Companion.getClass();
        aa.q0 q0Var3 = di.m;
        k71.k.g(q0Var3, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("organization", q0Var3, (String) null, rVar, no.a.s(pm.g, new aa.u0(new aa.t("repositoryOwner"))), r4));
    }
}
