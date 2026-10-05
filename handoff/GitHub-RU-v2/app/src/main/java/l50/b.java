package l50;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.c9;
import hc0.db;
import hc0.e9;
import hc0.fb;
import hc0.g9;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionPollOption");
        List list = n50.a.a;
        s c = no.a.c(list, "selections", "DiscussionPollOption", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        e9.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(e9.a), (String) null, rVar, rVar, r));
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("question", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        m mVar4 = new m("viewerHasVoted", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        m mVar5 = new m("totalVoteCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("viewerCanVote", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        g9.Companion.getClass();
        q0 q0Var = g9.a;
        k.g(q0Var, "type");
        c9.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("options", q0Var, (String) null, rVar, no.a.s(c9.a, new u0(8)), n2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
