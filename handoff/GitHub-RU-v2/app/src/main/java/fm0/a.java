package fm0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.j2;
import gn0.pb;
import gn0.q10;
import gn0.s00;
import gn0.tb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import xk0.d;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("UserStatus");
        List list = d.a;
        s c = no.a.c(list, "selections", "UserStatus", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q10.Companion.getClass();
        q0 q0Var = q10.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, new m("status", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        List n2 = d0.n(new m("status", q0Var, (String) null, rVar, rVar, l.r(new m[]{new m("user", l0.b(s00.P), (String) null, rVar, rVar, r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        j2.Companion.getClass();
        q0 q0Var2 = j2.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0.n(new m("changeUserStatus", q0Var2, (String) null, rVar, no.a.s(wh.q, new u0(x61.x.u(new w61.k("emoji", new t("emoji")), new w61.k("expiresAt", new t("expiresAt")), new w61.k("limitedAvailability", new t("indicatesLimitedAvailability")), new w61.k("message", new t("message")), new w61.k("organizationId", new t("organizationId"))))), n2));
    }
}
