package en0;

import gn0.c9;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionCategory");
        List list = xf0.a.a;
        aa.s c = no.a.c(list, "selections", "DiscussionCategory", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        c9.Companion.getClass();
        aa.q0 q0Var = c9.a;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("discussionCategory", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.d, new aa.u0(new aa.t("repositoryOwner"))), new aa.k(rn.e, new aa.u0(new aa.t("repositoryName"))), new aa.k(rn.f, new aa.u0(new aa.t("slug")))}), r));
    }
}
