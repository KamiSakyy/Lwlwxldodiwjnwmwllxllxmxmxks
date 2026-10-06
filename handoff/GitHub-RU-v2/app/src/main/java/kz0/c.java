package kz0;

import java.util.List;
import pz0.pa;
import pz0.ra;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionPoll");
        List list = hr0.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionPoll", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pa.Companion.getClass();
        aa.q0 q0Var = pa.b;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("poll", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ra.Companion.getClass();
        aa.q0 q0Var2 = ra.a;
        k71.k.g(q0Var2, "type");
        List n2 = sy.d0Shadow.n(new aa.m("pollOption", q0Var2, (String) null, rVar, rVar, r2));
        pz0.r.Companion.getClass();
        aa.q0 q0Var3 = pz0.r.a;
        k71.k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addDiscussionPollVote", q0Var3, (String) null, rVar, no.a.s(sk.c, new aa.u0(a0.s0.p("pollOptionId", new aa.t("option_id")))), n2));
    }
}
