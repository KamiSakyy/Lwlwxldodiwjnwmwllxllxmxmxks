package k10;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.rf0;
import m10.wg;
import m10.yn;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = l.r(new m[]{new m("hasValidDeviceAuthKey", b, (String) null, rVar, rVar, rVar), new m("hasExpiredAuthRequest", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yn.Companion.getClass();
        q0 q0Var = yn.a;
        k.g(q0Var, "type");
        m mVar = new m("mobileAuthStatus", q0Var, (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r2 = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
