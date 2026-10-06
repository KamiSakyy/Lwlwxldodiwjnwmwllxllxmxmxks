package lq0;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.bf;
import pz0.df;
import pz0.gu;
import pz0.jx;
import pz0.ny;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.uv;
import pz0.vd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        j0 j0Var = ny.e;
        m mVar5 = new m("owner", l0.b(j0Var), (String) null, rVar, rVar, r3);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("isPrivate", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar4 = vd.a;
        m mVar7 = new m("number", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bf.Companion.getClass();
        m mVar9 = new m("state", l0.b(bf.s), "issueState", rVar, rVar, rVar);
        jx.Companion.getClass();
        q0 q0Var = jx.t0;
        m mVar10 = new m("repository", l0.b(q0Var), (String) null, rVar, rVar, r4);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k.g(a0Var, "type");
        List r5 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, mVar10, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r6 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("owner", l0.b(j0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)})), new m("isPrivate", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar11 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar12 = new m("number", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar13 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        List r7 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r5), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar11, mVar12, mVar13, new m("state", l0.b(gu.s), "pullRequestState", rVar, rVar, rVar), new m("repository", l0.b(q0Var), (String) null, rVar, rVar, r6), new m("isInMergeQueue", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar14 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar15 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var2 = pz0.l.a;
        k.g(j0Var2, "type");
        m mVar16 = new m("actor", j0Var2, (String) null, rVar, rVar, r2);
        m mVar17 = new m("isCrossRepository", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        uv.Companion.getClass();
        m mVar18 = new m("source", l0.b(uv.a), (String) null, rVar, rVar, r7);
        o7.Companion.getClass();
        a = l.r(new m[]{mVar14, mVar15, mVar16, mVar17, mVar18, new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
    }
}
