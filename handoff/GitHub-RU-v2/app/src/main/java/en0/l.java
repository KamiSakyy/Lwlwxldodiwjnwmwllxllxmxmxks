package en0;

import gn0.s10;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Discussion", "DiscussionComment"});
        List list = td0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Votable", r, list)});
        s10.Companion.getClass();
        aa.j0 j0Var = s10.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("subject", j0Var, (String) null, rVar, rVar, r2));
        gn0.f0.Companion.getClass();
        aa.q0 q0Var = gn0.f0.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("addUpvote", q0Var, (String) null, rVar, no.a.s(wh.j, new aa.u0(a0.s0.p("subjectId", new aa.t("subject_id")))), n));
    }
}
