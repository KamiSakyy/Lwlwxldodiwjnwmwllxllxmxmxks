package fc0;

import hc0.fb;
import hc0.k00;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Discussion", "DiscussionComment"});
        List list = ma0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Votable", r, list)});
        k00.Companion.getClass();
        aa.j0 j0Var = k00.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("subject", j0Var, (String) null, rVar, rVar, r2));
        hc0.f0.Companion.getClass();
        aa.q0 q0Var = hc0.f0.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addUpvote", q0Var, (String) null, rVar, no.a.s(wg.j, new aa.u0(a0.s0.p("subjectId", new aa.t("subject_id")))), n));
    }
}
