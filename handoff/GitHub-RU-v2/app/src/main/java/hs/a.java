package hs;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.b00;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.r10;
import m10.sa;
import m10.wg;
import m10.wi;
import m10.yi;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        wi.Companion.getClass();
        m mVar2 = new m("state", l0.b(wi.s), "issueState", rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar2 = cc0.a;
        m mVar4 = new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar3 = ch.a;
        m mVar5 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        yi.Companion.getClass();
        a0 a0Var = yi.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar4 = ah.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)});
        b00.Companion.getClass();
        m mVar7 = new m("state", l0.b(b00.s), "pullRequestState", rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar5 = wg.a;
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r3), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar7, new m("isDraft", l0.b(xVar5), (String) null, rVar, rVar, rVar), new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("isInMergeQueue", l0.b(xVar5), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)}))});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        r10.Companion.getClass();
        m mVar11 = new m("subject", l0.b(r10.a), (String) null, rVar, rVar, r4);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
