package fc0;

import hc0.ap;
import hc0.bb;
import hc0.bj;
import hc0.db;
import hc0.fb;
import hc0.o8;
import hc0.pm;
import hc0.q8;
import hc0.xi;
import hc0.zi;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar2 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        aa.m mVar3 = new aa.m("number", v8.l0.b(db.a), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        aa.j0 j0Var = hc0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        q8.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("category", v8.l0.b(q8.a), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        o8.Companion.getClass();
        aa.m mVar7 = new aa.m("discussion", v8.l0.b(o8.l), (String) null, rVar, rVar, r4);
        bj.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("pattern", v8.l0.b(bj.s), (String) null, rVar, rVar, rVar), new aa.m("gradientStopColors", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        xi.Companion.getClass();
        List n = sy.d0.n(new aa.m("nodes", v8.l0.a(xi.a), (String) null, rVar, rVar, r5));
        aa.m mVar8 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zi.Companion.getClass();
        aa.r b2 = v8.l0.b(zi.a);
        ap.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar8, new aa.m("pinnedDiscussions", b2, (String) null, rVar, no.a.s(ap.G, new aa.u0(10)), n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repositoryName"))), new aa.k(pm.j, new aa.u0(new aa.t("repositoryOwner")))}), r6));
    }
}
