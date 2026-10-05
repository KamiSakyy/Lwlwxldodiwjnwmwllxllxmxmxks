package ew;

import aa.j0;
import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ak;
import m10.cc0;
import m10.eh;
import m10.fg0;
import m10.gh;
import m10.hg0;
import m10.i30;
import m10.l40;
import m10.wg;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = x61.l.r(new aa.m[]{new aa.m("color", xVar, (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        j0 j0Var = l40.e;
        List r5 = x61.l.r(new aa.m[]{mVar4, new aa.m("owner", l0.b(j0Var), (String) null, rVar, rVar, r4), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r6 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        List n = d0.n(new aa.m("nodes", l0.a(fg0.c), (String) null, rVar, rVar, r6));
        aa.s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        aa.s mVar6 = new aa.m("shortDescriptionHTML", l0.b(gh.a), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar3 = cc0.a;
        aa.s mVar9 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar4 = wg.a;
        aa.s mVar10 = new aa.m("isPrivate", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar11 = new aa.m("isArchived", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar12 = new aa.m("owner", l0.b(j0Var), (String) null, rVar, rVar, r2);
        ak.Companion.getClass();
        q0 q0Var = ak.a;
        k71.k.g(q0Var, "type");
        aa.s mVar13 = new aa.m("primaryLanguage", q0Var, (String) null, rVar, rVar, r3);
        aa.s mVar14 = new aa.m("usesCustomOpenGraphImage", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar15 = new aa.m("openGraphImageUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar16 = new aa.m("isInOrganization", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar17 = new aa.m("hasIssuesEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar18 = new aa.m("isDiscussionsEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar19 = new aa.m("isFork", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        q0 q0Var2 = i30.w0;
        k71.k.g(q0Var2, "type");
        aa.s mVar20 = new aa.m("parent", q0Var2, (String) null, rVar, rVar, r5);
        List n2 = d0.n("Repository");
        List list2 = p.a;
        aa.s c = no.a.c(list2, "selections", "Repository", n2, list2);
        hg0.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, mVar20, c, new aa.m("lists", l0.b(hg0.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.w, new u0(100)), new aa.k(i30.x, new u0(Boolean.TRUE))}), n)});
    }
}
