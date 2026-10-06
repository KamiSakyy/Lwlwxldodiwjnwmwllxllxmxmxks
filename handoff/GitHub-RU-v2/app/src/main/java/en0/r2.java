package en0;

import gn0.a9;
import gn0.dj;
import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Discussion");
        List list = vf0.c.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Discussion", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Discussion", sy.d0Shadow.n("Discussion"), r);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, nVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        a9.Companion.getClass();
        aa.q0 q0Var = a9.l;
        k71.k.g(q0Var, "type");
        eq.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("discussion", q0Var, (String) null, rVar, no.a.s(eq.i, new aa.u0(new aa.t("discussionNumber"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = eq.m0;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var2, (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        dj.Companion.getClass();
        aa.q0 q0Var3 = dj.m;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("organization", q0Var3, (String) null, rVar, no.a.s(rn.j, new aa.u0(new aa.t("repositoryOwner"))), r4));
    }
}
