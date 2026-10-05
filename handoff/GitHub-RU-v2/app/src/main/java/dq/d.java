package dq;

import aa.u0;
import java.util.List;
import m10.o8;
import m10.qa;
import m10.wg;
import m10.yg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        qa.Companion.getClass();
        aa.x xVar = qa.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("resetDate", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.x xVar2 = wg.a;
        k71.k.g(xVar2, "type");
        o8.Companion.getClass();
        aa.m mVar2 = new aa.m("hasUsageRemaining", xVar2, (String) null, rVar, no.a.s(o8.a, new u0("CHAT")), rVar);
        yg.Companion.getClass();
        aa.x xVar3 = yg.a;
        k71.k.g(xVar3, "type");
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("quotaPercentageRemaining", xVar3, (String) null, rVar, no.a.s(o8.b, new u0("CHAT")), rVar)});
    }
}
