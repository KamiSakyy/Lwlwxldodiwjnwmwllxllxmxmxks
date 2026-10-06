package x80;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.a00;
import hc0.ap;
import hc0.bb;
import hc0.bd;
import hc0.dq;
import hc0.ew;
import hc0.fb;
import hc0.hb;
import hc0.xa;
import hc0.yz;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        List r2 = x61.l.r(new s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = x61.l.r(new aa.m[]{new aa.m("color", xVar, (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        j0 j0Var = dq.a;
        List r5 = x61.l.r(new aa.m[]{mVar4, new aa.m("owner", l0.b(j0Var), (String) null, rVar, rVar, r4), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r6 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        List n = d0Shadow.n(new aa.m("nodes", l0.a(yz.c), (String) null, rVar, rVar, r6));
        s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        s mVar6 = new aa.m("shortDescriptionHTML", l0.b(hb.a), (String) null, rVar, rVar, rVar);
        s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar8 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        x xVar3 = ew.a;
        s mVar9 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar4 = xa.a;
        s mVar10 = new aa.m("isPrivate", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar11 = new aa.m("isArchived", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar12 = new aa.m("owner", l0.b(j0Var), (String) null, rVar, rVar, r2);
        bd.Companion.getClass();
        q0 q0Var = bd.a;
        k71.k.g(q0Var, "type");
        s mVar13 = new aa.m("primaryLanguage", q0Var, (String) null, rVar, rVar, r3);
        s mVar14 = new aa.m("usesCustomOpenGraphImage", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar15 = new aa.m("openGraphImageUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar16 = new aa.m("isInOrganization", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar17 = new aa.m("hasIssuesEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar18 = new aa.m("isDiscussionsEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar19 = new aa.m("isFork", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        ap.Companion.getClass();
        q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        s mVar20 = new aa.m("parent", q0Var2, (String) null, rVar, rVar, r5);
        List n2 = d0Shadow.n("Repository");
        List list2 = k.a;
        s c = no.a.c(list2, "selections", "Repository", n2, list2);
        a00.Companion.getClass();
        a = x61.l.r(new s[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, mVar20, c, new aa.m("lists", l0.b(a00.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.w, new u0(100)), new aa.k(ap.x, new u0(Boolean.TRUE))}), n)});
    }
}
