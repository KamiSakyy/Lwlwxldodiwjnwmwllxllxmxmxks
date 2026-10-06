package kb0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import fa0.d;
import hc0.bb;
import hc0.fb;
import hc0.h2;
import hc0.i00;
import hc0.kz;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("UserStatus");
        List list = d.a;
        s c = no.a.c(list, "selections", "UserStatus", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        i00.Companion.getClass();
        q0 q0Var = i00.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, new m("status", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        List n2 = d0Shadow.n(new m("status", q0Var, (String) null, rVar, rVar, l.r(new m[]{new m("user", l0.b(kz.O), (String) null, rVar, rVar, r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        h2.Companion.getClass();
        q0 q0Var2 = h2.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0Shadow.n(new m("changeUserStatus", q0Var2, (String) null, rVar, no.a.s(wg.q, new u0(x61.x.u(new w61.k[]{new w61.k("emoji", new t("emoji")), new w61.k("expiresAt", new t("expiresAt")), new w61.k("limitedAvailability", new t("indicatesLimitedAvailability")), new w61.k("message", new t("message")), new w61.k("organizationId", new t("organizationId"))}))), n2));
    }
}
