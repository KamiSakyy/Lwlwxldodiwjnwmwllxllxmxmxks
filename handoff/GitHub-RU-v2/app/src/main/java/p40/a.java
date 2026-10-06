package p40;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.dq;
import hc0.fb;
import hc0.fm;
import hc0.h6;
import hc0.jc;
import hc0.lc;
import hc0.rn;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        j0 j0Var = dq.a;
        m mVar5 = new m("owner", l0.b(j0Var), (String) null, rVar, rVar, r3);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("isPrivate", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar4 = db.a;
        m mVar7 = new m("number", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jc.Companion.getClass();
        m mVar9 = new m("state", l0.b(jc.s), "issueState", rVar, rVar, rVar);
        ap.Companion.getClass();
        q0 q0Var = ap.k0;
        m mVar10 = new m("repository", l0.b(q0Var), (String) null, rVar, rVar, r4);
        lc.Companion.getClass();
        a0 a0Var = lc.s;
        k.g(a0Var, "type");
        List r5 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, mVar10, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r6 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("owner", l0.b(j0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)})), new m("isPrivate", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar11 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar12 = new m("number", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar13 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        List r7 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r5), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar11, mVar12, mVar13, new m("state", l0.b(fm.s), "pullRequestState", rVar, rVar, rVar), new m("repository", l0.b(q0Var), (String) null, rVar, rVar, r6), new m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar14 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar15 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var2 = hc0.l.a;
        k.g(j0Var2, "type");
        m mVar16 = new m("actor", j0Var2, (String) null, rVar, rVar, r2);
        m mVar17 = new m("isCrossRepository", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        rn.Companion.getClass();
        m mVar18 = new m("source", l0.b(rn.a), (String) null, rVar, rVar, r7);
        h6.Companion.getClass();
        a = l.r(new m[]{mVar14, mVar15, mVar16, mVar17, mVar18, new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar)});
    }
}
