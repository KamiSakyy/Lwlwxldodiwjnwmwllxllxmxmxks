package km0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import gn0.lb;
import gn0.nh;
import gn0.pb;
import gn0.qz;
import gn0.s00;
import gn0.tb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        lb.Companion.getClass();
        r b = l0.b(lb.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("getsAssignments", b, (String) null, rVar, rVar, rVar));
        nh.Companion.getClass();
        q0 q0Var = nh.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, n);
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var2 = s00.P;
        k.g(q0Var2, "type");
        List r2 = l.r(new m[]{mVar3, new m("user", q0Var2, (String) null, rVar, rVar, r)});
        qz.Companion.getClass();
        q0 q0Var3 = qz.a;
        k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = d0Shadow.n(new m("updateMobilePushNotificationSettings", q0Var3, (String) null, rVar, no.a.s(wh.R0, new u0(s0.p("getAssignments", new t("enabled")))), r2));
    }
}
