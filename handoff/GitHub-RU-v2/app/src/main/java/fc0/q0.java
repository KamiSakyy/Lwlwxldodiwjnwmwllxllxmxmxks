package fc0;

import hc0.bb;
import hc0.fb;
import hc0.pm;
import hc0.q8;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionCategory");
        List list = h50.a.a;
        aa.s c = no.a.c(list, "selections", "DiscussionCategory", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        q8.Companion.getClass();
        aa.q0 q0Var = q8.a;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("discussionCategory", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.a, new aa.u0(new aa.t("repositoryOwner"))), new aa.k(pm.b, new aa.u0(new aa.t("repositoryName"))), new aa.k(pm.c, new aa.u0(new aa.t("slug")))}), r));
    }
}
