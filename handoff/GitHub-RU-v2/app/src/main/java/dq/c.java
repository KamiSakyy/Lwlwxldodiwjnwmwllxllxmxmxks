package dq;

import aa.u0;
import java.util.List;
import m10.e8;
import m10.eh;
import m10.qa;
import m10.wg;
import m10.yg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        qa.Companion.getClass();
        aa.x xVar = qa.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("resetDate", xVar, (String) null, rVar, rVar, rVar);
        yg.Companion.getClass();
        aa.x xVar2 = yg.a;
        aa.r b = v8.l0.b(xVar2);
        e8.Companion.getClass();
        a81.t tVar = e8.a;
        aa.m mVar2 = new aa.m("currentOverageCount", b, "freeOverageCount", rVar, no.a.s(tVar, new u0("CHAT")), rVar);
        aa.m mVar3 = new aa.m("currentOverageCount", v8.l0.b(xVar2), "premiumOverageCount", rVar, no.a.s(tVar, new u0("PREMIUM_INTERACTIONS")), rVar);
        aa.m mVar4 = new aa.m("entitlement", v8.l0.b(xVar2), (String) null, rVar, no.a.s(e8.b, new u0("CHAT")), rVar);
        wg.Companion.getClass();
        aa.m mVar5 = new aa.m("isOveragePermitted", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        a81.t tVar2 = e8.c;
        aa.m mVar6 = new aa.m("percentRemaining", xVar2, "freeRemaining", rVar, no.a.s(tVar2, new u0("CHAT")), rVar);
        aa.m mVar7 = new aa.m("percentRemaining", xVar2, "premiumRemaining", rVar, no.a.s(tVar2, new u0("PREMIUM_INTERACTIONS")), rVar);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new aa.m("quotaId", v8.l0.b(eh.a), (String) null, rVar, no.a.s(e8.d, new u0("CHAT")), rVar)});
    }
}
