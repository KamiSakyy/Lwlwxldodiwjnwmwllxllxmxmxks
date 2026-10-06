package l00;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.je0;
import m10.kp;
import m10.rf0;
import m10.vp;
import m10.wg;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = x61.l.r(new m[]{new m("getsCiFailedOnly", b, (String) null, rVar, rVar, rVar), new m("getsCiActivity", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        kp.Companion.getClass();
        q0 q0Var = kp.a;
        k71.k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r2 = x61.l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("clientMutationId", xVar2, (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        q0 q0Var2 = rf0.g0;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new m[]{mVar3, new m("user", q0Var2, (String) null, rVar, rVar, r2)});
        je0.Companion.getClass();
        q0 q0Var3 = je0.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("updateMobilePushNotificationSettings", q0Var3, (String) null, rVar, no.a.s(vp.k1, new u0(x61.x.u(new w61.k[]{new w61.k("getCiActivity", new t("enabled")), new w61.k("getCiFailedOnly", new t("enabled"))}))), r3));
    }
}
