package ps;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.td;
import m10.vd;
import m10.wg;
import m10.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionPollOption");
        List list = rs.a.a;
        s c = no.a.c(list, "selections", "DiscussionPollOption", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(vd.a), (String) null, rVar, rVar, r));
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("question", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        m mVar4 = new m("viewerHasVoted", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar5 = new m("totalVoteCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("viewerCanVote", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        q0 q0Var = xd.a;
        k.g(q0Var, "type");
        td.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("options", q0Var, (String) null, rVar, no.a.s(td.a, new u0(8)), n2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
