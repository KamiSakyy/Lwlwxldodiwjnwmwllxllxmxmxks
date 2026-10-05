package en0;

import gn0.eq;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = pj0.f.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        rb.Companion.getClass();
        aa.x xVar = rb.a;
        aa.r b2 = v8.l0.b(xVar);
        eq.Companion.getClass();
        aa.s mVar2 = new aa.m("starsSince", b2, (String) null, rVar, no.a.s(eq.d0, new aa.u0(new aa.t("period"))), rVar);
        aa.s mVar3 = new aa.m("contributorsCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        aa.p a2 = v8.l0.a(eq.m0);
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("trendingRepositories", a2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.u, new aa.u0(new aa.t("language"))), new aa.k(rn.v, new aa.u0(Boolean.TRUE)), new aa.k(rn.w, new aa.u0(new aa.t("period"))), new aa.k(rn.x, new aa.u0(new aa.t("spokenLanguageCode")))}), r));
    }
}
