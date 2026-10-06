package en0;

import gn0.ep;
import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.vb;
import gn0.yo;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e3 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("tagName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        vb.Companion.getClass();
        aa.x xVar3 = vb.a;
        k71.k.g(xVar3, "type");
        aa.m mVar5 = new aa.m("descriptionHTML", xVar3, (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        aa.m mVar6 = new aa.m("author", q0Var, (String) null, rVar, rVar, r2);
        gn0.r6.Companion.getClass();
        aa.x xVar4 = gn0.r6.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new aa.m("createdAt", v8.l0.b(xVar4), (String) null, rVar, rVar, rVar), new aa.m("publishedAt", xVar4, (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        aa.x xVar5 = lb.a;
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar5), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Actor", x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar9 = new aa.m("tagName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar10 = new aa.m("author", q0Var, (String) null, rVar, rVar, r5);
        aa.m mVar11 = new aa.m("isPrerelease", v8.l0.b(xVar5), (String) null, rVar, rVar, rVar);
        aa.m mVar12 = new aa.m("isDraft", v8.l0.b(xVar5), (String) null, rVar, rVar, rVar);
        aa.m mVar13 = new aa.m("isLatest", v8.l0.b(xVar5), (String) null, rVar, rVar, rVar);
        aa.m mVar14 = new aa.m("createdAt", v8.l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.m mVar15 = new aa.m("publishedAt", xVar4, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new aa.m("url", v8.l0.b(mx.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar16 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r4);
        yo.Companion.getClass();
        aa.q0 q0Var2 = yo.e;
        List r7 = x61.l.r(new aa.m[]{mVar16, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r6)});
        aa.m mVar17 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar18 = new aa.m("latestRelease", q0Var2, (String) null, rVar, rVar, r3);
        ep.Companion.getClass();
        aa.r b2 = v8.l0.b(ep.a);
        eq.Companion.getClass();
        List r8 = x61.l.r(new aa.m[]{mVar17, mVar18, new aa.m("releases", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.W, new aa.u0(new aa.t("after"))), new aa.k(eq.X, new aa.u0(new aa.t("number"))), new aa.k(eq.Y, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "CREATED_AT"))))}), r7), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(rn.m, new aa.u0(new aa.t("repositoryOwner")))}), r8));
    }
}
