package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.k9;
import m10.m8;
import m10.qh;
import m10.rf0;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i0 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("success", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("message", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("success", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("message", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r3 = x61.l.r(new aa.m[]{new aa.m("success", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("message", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m8.Companion.getClass();
        aa.a0 a0Var = m8.s;
        k71.k.g(a0Var, "type");
        List r4 = x61.l.r(new aa.m[]{mVar2, new aa.m("copilotLicenseType", a0Var, (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("clientMutationId", xVar2, (String) null, rVar, rVar, rVar);
        qh.Companion.getClass();
        aa.q0 q0Var = qh.a;
        k71.k.g(q0Var, "type");
        aa.m mVar4 = new aa.m("copilot", q0Var, (String) null, rVar, rVar, r);
        aa.m mVar5 = new aa.m("copilotProPlus", q0Var, (String) null, rVar, rVar, r2);
        aa.m mVar6 = new aa.m("copilotMax", q0Var, (String) null, rVar, rVar, r3);
        rf0.Companion.getClass();
        aa.q0 q0Var2 = rf0.g0;
        k71.k.g(q0Var2, "type");
        List r5 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, new aa.m("viewer", q0Var2, (String) null, rVar, rVar, r4)});
        k9.Companion.getClass();
        aa.q0 q0Var3 = k9.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createGoogleIapSubscription", q0Var3, (String) null, rVar, no.a.s(vp.G, new aa.u0(x61.x.u(new w61.k[]{new w61.k("productId", new aa.t("productId")), new w61.k("purchaseToken", new aa.t("purchaseToken"))}))), r5));
    }
}
