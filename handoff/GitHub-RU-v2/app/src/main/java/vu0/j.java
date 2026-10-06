package vu0;

import aa.j0;
import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ag;
import pz0.h50;
import pz0.jx;
import pz0.k90;
import pz0.m90;
import pz0.ny;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.zd;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        aa.s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = x61.l.r(new aa.m[]{new aa.m("color", xVar, (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        j0 j0Var = ny.e;
        List r5 = x61.l.r(new aa.m[]{mVar4, new aa.m("owner", l0.b(j0Var), (String) null, rVar, rVar, r4), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r6 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        List n = d0Shadow.n(new aa.m("nodes", l0.a(k90.c), (String) null, rVar, rVar, r6));
        aa.s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        aa.s mVar6 = new aa.m("shortDescriptionHTML", l0.b(zd.a), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar3 = h50.a;
        aa.s mVar9 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar4 = pd.a;
        aa.s mVar10 = new aa.m("isPrivate", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar11 = new aa.m("isArchived", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar12 = new aa.m("owner", l0.b(j0Var), (String) null, rVar, rVar, r2);
        ag.Companion.getClass();
        q0 q0Var = ag.a;
        k71.k.g(q0Var, "type");
        aa.s mVar13 = new aa.m("primaryLanguage", q0Var, (String) null, rVar, rVar, r3);
        aa.s mVar14 = new aa.m("usesCustomOpenGraphImage", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar15 = new aa.m("openGraphImageUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar16 = new aa.m("isInOrganization", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar17 = new aa.m("hasIssuesEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar18 = new aa.m("isDiscussionsEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar19 = new aa.m("isFork", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        aa.s mVar20 = new aa.m("parent", q0Var2, (String) null, rVar, rVar, r5);
        List n2 = d0Shadow.n("Repository");
        List list2 = o.a;
        aa.s c = no.a.c(list2, "selections", "Repository", n2, list2);
        m90.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, mVar20, c, new aa.m("lists", l0.b(m90.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.z, new u0(100)), new aa.k(jx.A, new u0(Boolean.TRUE))}), n)});
    }
}
