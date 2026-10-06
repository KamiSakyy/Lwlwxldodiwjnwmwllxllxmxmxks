package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = ew.j.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        ch.Companion.getClass();
        aa.x xVar2 = ch.a;
        aa.r b2 = v8.l0.b(xVar2);
        i30.Companion.getClass();
        aa.s mVar2 = new aa.m("starsSince", b2, (String) null, rVar, no.a.s(i30.h0, new aa.u0(new aa.t("period"))), rVar);
        aa.s mVar3 = new aa.m("contributorsCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.p a2 = v8.l0.a(i30.w0);
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("trendingRepositories", a2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.A, new aa.u0(new aa.t("language"))), new aa.k(p00.B, new aa.u0(Boolean.TRUE)), new aa.k(p00.C, new aa.u0(new aa.t("period"))), new aa.k(p00.D, new aa.u0(new aa.t("spokenLanguageCode")))}), r), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
