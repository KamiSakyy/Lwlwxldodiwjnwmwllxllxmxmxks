package oy0;

import a0.s0;
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
public abstract class f {
    public static final List a;

    static {
        pd.Companion.getClass();
        r b = l0.b(pd.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("getsDeploymentRequests", b, (String) null, rVar, rVar, rVar));
        jk.Companion.getClass();
        q0 q0Var = jk.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, n);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var2 = w80.W;
        k.g(q0Var2, "type");
        List r2 = l.r(new m[]{mVar3, new m("user", q0Var2, (String) null, rVar, rVar, r)});
        o70.Companion.getClass();
        q0 q0Var3 = o70.a;
        k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = d0.n(new m("updateMobilePushNotificationSettings", q0Var3, (String) null, rVar, no.a.s(sk.f1, new u0(s0.p("getDeploymentRequests", new t("enabled")))), r2));
    }
}
