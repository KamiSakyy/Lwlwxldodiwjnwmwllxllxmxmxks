package h10;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.d20;
import m10.eh;
import m10.gh;
import m10.i30;
import m10.mr;
import m10.p00;
import m10.rf0;
import m10.sa;
import m10.wg;
import m10.x10;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("tagName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        aa.x xVar3 = gh.a;
        k71.k.g(xVar3, "type");
        aa.m mVar5 = new aa.m("descriptionHTML", xVar3, (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        aa.m mVar6 = new aa.m("author", q0Var, (String) null, rVar, rVar, r2);
        sa.Companion.getClass();
        aa.x xVar4 = sa.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new aa.m("createdAt", v8.l0.b(xVar4), (String) null, rVar, rVar, rVar), new aa.m("publishedAt", xVar4, (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        wg.Companion.getClass();
        aa.x xVar5 = wg.a;
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
        cc0.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar16 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r4);
        x10.Companion.getClass();
        aa.q0 q0Var2 = x10.e;
        List r7 = x61.l.r(new aa.m[]{mVar16, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r6)});
        aa.m mVar17 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar18 = new aa.m("latestRelease", q0Var2, (String) null, rVar, rVar, r3);
        d20.Companion.getClass();
        aa.r b2 = v8.l0.b(d20.a);
        i30.Companion.getClass();
        List r8 = x61.l.r(new aa.m[]{mVar17, mVar18, new aa.m("releases", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.a0, new aa.u0(new aa.t("after"))), new aa.k(i30.b0, new aa.u0(new aa.t("number"))), new aa.k(i30.c0, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", "DESC"), new w61.k("field", "CREATED_AT")})))}), r7), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(p00.m, new aa.u0(new aa.t("repositoryOwner")))}), r8), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
