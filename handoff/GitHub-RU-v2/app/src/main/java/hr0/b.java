package hr0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.pa;
import pz0.pd;
import pz0.ra;
import pz0.ta;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiscussionPollOption");
        List list = jr0.a.a;
        s c = no.a.c(list, "selections", "DiscussionPollOption", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ra.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(ra.a), (String) null, rVar, rVar, r));
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("question", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        m mVar4 = new m("viewerHasVoted", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar5 = new m("totalVoteCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("viewerCanVote", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        q0 q0Var = ta.a;
        k.g(q0Var, "type");
        pa.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("options", q0Var, (String) null, rVar, no.a.s(pa.a, new u0(8)), n2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
