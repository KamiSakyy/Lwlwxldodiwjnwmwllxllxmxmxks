package zq0;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.bf;
import pz0.df;
import pz0.gu;
import pz0.h50;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.uv;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        bf.Companion.getClass();
        m mVar2 = new m("state", l0.b(bf.s), "issueState", rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar2 = h50.a;
        m mVar4 = new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar3 = vd.a;
        m mVar5 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar4 = td.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)});
        gu.Companion.getClass();
        m mVar7 = new m("state", l0.b(gu.s), "pullRequestState", rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar5 = pd.a;
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), r3), new n("PullRequest", d0.n("PullRequest"), l.r(new m[]{mVar7, new m("isDraft", l0.b(xVar5), (String) null, rVar, rVar, rVar), new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("url", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("isInMergeQueue", l0.b(xVar5), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar)}))});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        uv.Companion.getClass();
        m mVar11 = new m("subject", l0.b(uv.a), (String) null, rVar, rVar, r4);
        o7.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
    }
}
