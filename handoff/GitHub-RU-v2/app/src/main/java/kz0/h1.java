package kz0;

import java.util.List;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = vu0.j.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        vd.Companion.getClass();
        aa.x xVar2 = vd.a;
        aa.r b2 = v8.l0.b(xVar2);
        jx.Companion.getClass();
        aa.s mVar2 = new aa.m("starsSince", b2, (String) null, rVar, no.a.s(jx.k0, new aa.u0(new aa.t("period"))), rVar);
        aa.s mVar3 = new aa.m("contributorsCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.p a2 = v8.l0.a(jx.t0);
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("trendingRepositories", a2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.u, new aa.u0(new aa.t("language"))), new aa.k(su.v, new aa.u0(Boolean.TRUE)), new aa.k(su.w, new aa.u0(new aa.t("period"))), new aa.k(su.x, new aa.u0(new aa.t("spokenLanguageCode")))}), r), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
