package fc0;

import hc0.bb;
import hc0.c9;
import hc0.e9;
import hc0.fb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiscussionPoll");
        List list = l50.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionPoll", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        c9.Companion.getClass();
        aa.q0 q0Var = c9.b;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("poll", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        e9.Companion.getClass();
        aa.q0 q0Var2 = e9.a;
        k71.k.g(q0Var2, "type");
        List n2 = sy.d0.n(new aa.m("pollOption", q0Var2, (String) null, rVar, rVar, r2));
        hc0.r.Companion.getClass();
        aa.q0 q0Var3 = hc0.r.a;
        k71.k.g(q0Var3, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("addDiscussionPollVote", q0Var3, (String) null, rVar, no.a.s(wg.c, new aa.u0(a0.s0.p("pollOptionId", new aa.t("option_id")))), n2));
    }
}
