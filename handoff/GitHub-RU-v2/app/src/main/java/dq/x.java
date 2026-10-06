package dq;

import java.util.List;
import m10.eh;
import m10.m8;
import m10.vo;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("title", b, (String) null, rVar, rVar, rVar));
        m8.Companion.getClass();
        aa.m mVar = new aa.m("copilotLicenseType", v8.l0.b(m8.s), (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("subtitle", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("featuresHeader", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        vo.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("features", no.a.d(vo.a), (String) null, rVar, rVar, n)});
    }
}
