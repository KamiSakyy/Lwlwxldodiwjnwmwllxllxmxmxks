package en0;

import gn0.a9;
import gn0.dj;
import gn0.eq;
import gn0.i9;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q2 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.x xVar = pb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        i9.Companion.getClass();
        aa.q0 q0Var = i9.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        a9.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("comment", q0Var, (String) null, rVar, no.a.s(a9.f, new aa.u0(new aa.t("commentUrl"))), r2), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = a9.l;
        k71.k.g(q0Var2, "type");
        eq.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("discussion", q0Var2, (String) null, rVar, no.a.s(eq.i, new aa.u0(new aa.t("discussionNumber"))), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        List r5 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var3, (String) null, rVar, rVar, r4), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        dj.Companion.getClass();
        aa.q0 q0Var4 = dj.m;
        k71.k.g(q0Var4, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("organization", q0Var4, (String) null, rVar, no.a.s(rn.j, new aa.u0(new aa.t("repositoryOwner"))), r5));
    }
}
