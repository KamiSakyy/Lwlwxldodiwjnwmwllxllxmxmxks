package kz0;

import java.util.List;
import pz0.rw;
import pz0.sk;
import pz0.w90;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Discussion", "DiscussionComment"});
        List list = bp0.g.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Votable", r, list)});
        w90.Companion.getClass();
        aa.j0 j0Var = w90.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("subject", j0Var, (String) null, rVar, rVar, r2));
        rw.Companion.getClass();
        aa.q0 q0Var = rw.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("removeUpvote", q0Var, (String) null, rVar, no.a.s(sk.B0, new aa.u0(a0.s0.p("subjectId", new aa.t("subject_id")))), n));
    }
}
