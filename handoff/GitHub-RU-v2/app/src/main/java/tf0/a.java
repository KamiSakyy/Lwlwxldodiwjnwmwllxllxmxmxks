package tf0;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import gn0.hn;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import gn0.uo;
import gn0.xc;
import gn0.zc;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        xc.Companion.getClass();
        m mVar2 = new m("state", l0.b(xc.s), "issueState", rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        x xVar2 = mx.a;
        m mVar4 = new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar3 = rb.a;
        m mVar5 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        zc.Companion.getClass();
        a0 a0Var = zc.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar4 = pb.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)});
        hn.Companion.getClass();
        m mVar7 = new m("state", l0.b(hn.s), "pullRequestState", rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar5 = lb.a;
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), r3), new n("PullRequest", d0.n("PullRequest"), l.r(new m[]{mVar7, new m("isDraft", l0.b(xVar5), (String) null, rVar, rVar, rVar), new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("isInMergeQueue", l0.b(xVar5), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)}))});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        uo.Companion.getClass();
        m mVar11 = new m("subject", l0.b(uo.a), (String) null, rVar, rVar, r4);
        r6.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar)});
    }
}
