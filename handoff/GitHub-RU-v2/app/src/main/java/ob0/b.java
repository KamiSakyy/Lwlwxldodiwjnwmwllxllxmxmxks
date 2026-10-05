package ob0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.iy;
import hc0.kz;
import hc0.ng;
import hc0.wg;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        xa.Companion.getClass();
        r b = l0.b(xa.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("getsAssignments", b, (String) null, rVar, rVar, rVar));
        ng.Companion.getClass();
        q0 q0Var = ng.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, n);
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        q0 q0Var2 = kz.O;
        k.g(q0Var2, "type");
        List r2 = l.r(new m[]{mVar3, new m("user", q0Var2, (String) null, rVar, rVar, r)});
        iy.Companion.getClass();
        q0 q0Var3 = iy.a;
        k.g(q0Var3, "type");
        wg.Companion.getClass();
        a = d0.n(new m("updateMobilePushNotificationSettings", q0Var3, (String) null, rVar, no.a.s(wg.P0, new u0(s0.p("getAssignments", new t("enabled")))), r2));
    }
}
