package en0;

import gn0.o9;
import gn0.pb;
import gn0.q9;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionPoll");
        List list = bg0.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionPoll", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        o9.Companion.getClass();
        aa.q0 q0Var = o9.b;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("poll", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q9.Companion.getClass();
        aa.q0 q0Var2 = q9.a;
        k71.k.g(q0Var2, "type");
        List n2 = sy.d0Shadow.n(new aa.m("pollOption", q0Var2, (String) null, rVar, rVar, r2));
        gn0.r.Companion.getClass();
        aa.q0 q0Var3 = gn0.r.a;
        k71.k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addDiscussionPollVote", q0Var3, (String) null, rVar, no.a.s(wh.c, new aa.u0(a0.s0.p("pollOptionId", new aa.t("option_id")))), n2));
    }
}
