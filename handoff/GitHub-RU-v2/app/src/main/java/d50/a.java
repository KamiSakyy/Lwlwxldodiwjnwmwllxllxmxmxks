package d50;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.ew;
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
        jc.Companion.getClass();
        m mVar2 = new m("state", l0.b(jc.s), "issueState", rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        x xVar2 = ew.a;
        m mVar4 = new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar3 = db.a;
        m mVar5 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        lc.Companion.getClass();
        a0 a0Var = lc.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar4 = bb.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)});
        fm.Companion.getClass();
        m mVar7 = new m("state", l0.b(fm.s), "pullRequestState", rVar, rVar, rVar);
        xa.Companion.getClass();
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r3), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar7, new m("isDraft", l0.b(xa.a), (String) null, rVar, rVar, rVar), new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)}))});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        rn.Companion.getClass();
        m mVar11 = new m("subject", l0.b(rn.a), (String) null, rVar, rVar, r4);
        h6.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar)});
    }
}
