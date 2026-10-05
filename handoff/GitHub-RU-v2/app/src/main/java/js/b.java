package js;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.sa;
import m10.wg;
import m10.zd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar = wg.a;
        m mVar2 = new m("closed", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("viewerCanClose", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("viewerCanReopen", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar2 = sa.a;
        k.g(xVar2, "type");
        m mVar5 = new m("closedAt", xVar2, (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        a0 a0Var = zd.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
