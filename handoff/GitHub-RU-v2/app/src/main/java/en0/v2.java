package en0;

import gn0.a9;
import gn0.bk;
import gn0.c9;
import gn0.eq;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import gn0.xj;
import gn0.zj;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar2 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        aa.m mVar3 = new aa.m("number", v8.l0.b(rb.a), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        aa.j0 j0Var = gn0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        c9.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("category", v8.l0.b(c9.a), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        a9.Companion.getClass();
        aa.m mVar7 = new aa.m("discussion", v8.l0.b(a9.l), (String) null, rVar, rVar, r4);
        bk.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("pattern", v8.l0.b(bk.s), (String) null, rVar, rVar, rVar), new aa.m("gradientStopColors", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        xj.Companion.getClass();
        List n = sy.d0.n(new aa.m("nodes", v8.l0.a(xj.a), (String) null, rVar, rVar, r5));
        aa.m mVar8 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zj.Companion.getClass();
        aa.r b2 = v8.l0.b(zj.a);
        eq.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar8, new aa.m("pinnedDiscussions", b2, (String) null, rVar, no.a.s(eq.H, new aa.u0(10)), n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(rn.m, new aa.u0(new aa.t("repositoryOwner")))}), r6));
    }
}
