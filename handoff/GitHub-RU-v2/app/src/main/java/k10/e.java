package k10;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.rf0;
import m10.un;
import m10.wg;
import m10.wn;
import m10.yn;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        m mVar2 = new m("payload", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        m mVar3 = new m("challengeRequired", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wn.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("type", l0.b(wn.s), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("hasValidDeviceAuthKey", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("hasExpiredAuthRequest", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        un.Companion.getClass();
        q0 q0Var = un.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar4, mVar5, new m("activeAuthRequest", q0Var, (String) null, rVar, rVar, r)});
        m mVar6 = new m("email", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("primaryEmail", xVar, (String) null, rVar, rVar, rVar);
        m mVar8 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        yn.Companion.getClass();
        q0 q0Var2 = yn.a;
        k.g(q0Var2, "type");
        m mVar9 = new m("mobileAuthStatus", q0Var2, (String) null, rVar, rVar, r2);
        ah.Companion.getClass();
        x xVar3 = ah.a;
        List r3 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
