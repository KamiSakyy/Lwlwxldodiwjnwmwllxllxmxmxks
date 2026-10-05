package h10;

import java.util.List;
import m10.eh;
import m10.o20;
import m10.rg0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Discussion", "DiscussionComment"});
        List list = dq.j.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Votable", r, list)});
        rg0.Companion.getClass();
        aa.j0 j0Var = rg0.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("subject", j0Var, (String) null, rVar, rVar, r2));
        o20.Companion.getClass();
        aa.q0 q0Var = o20.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("removeUpvote", q0Var, (String) null, rVar, no.a.s(vp.F0, new aa.u0(a0.s0.p("subjectId", new aa.t("subject_id")))), n));
    }
}
