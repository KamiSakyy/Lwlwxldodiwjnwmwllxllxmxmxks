package kz0;

import java.util.List;
import pz0.ba;
import pz0.bn;
import pz0.da;
import pz0.dn;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.zm;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar2 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        aa.m mVar3 = new aa.m("number", v8.l0.b(vd.a), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        aa.j0 j0Var = pz0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        da.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("category", v8.l0.b(da.a), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ba.Companion.getClass();
        aa.m mVar7 = new aa.m("discussion", v8.l0.b(ba.l), (String) null, rVar, rVar, r4);
        dn.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("pattern", v8.l0.b(dn.s), (String) null, rVar, rVar, rVar), new aa.m("gradientStopColors", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        zm.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(zm.a), (String) null, rVar, rVar, r5));
        aa.m mVar8 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        bn.Companion.getClass();
        aa.r b2 = v8.l0.b(bn.a);
        jx.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar8, new aa.m("pinnedDiscussions", b2, (String) null, rVar, no.a.s(jx.K, new aa.u0(10)), n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = jx.t0;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(su.m, new aa.u0(new aa.t("repositoryOwner")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
