package oy0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.jk;
import pz0.o70;
import pz0.pd;
import pz0.sk;
import pz0.td;
import pz0.w80;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = l.r(new m[]{new m("getsCiFailedOnly", b, (String) null, rVar, rVar, rVar), new m("getsCiActivity", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jk.Companion.getClass();
        q0 q0Var = jk.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, r);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r2 = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("clientMutationId", xVar2, (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var2 = w80.W;
        k.g(q0Var2, "type");
        List r3 = l.r(new m[]{mVar3, new m("user", q0Var2, (String) null, rVar, rVar, r2)});
        o70.Companion.getClass();
        q0 q0Var3 = o70.a;
        k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = d0.n(new m("updateMobilePushNotificationSettings", q0Var3, (String) null, rVar, no.a.s(sk.f1, new u0(x61.x.u(new w61.k("getCiActivity", new t("enabled")), new w61.k("getCiFailedOnly", new t("enabled"))))), r3));
    }
}
