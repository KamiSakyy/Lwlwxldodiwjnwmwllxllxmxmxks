package vf0;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import gn0.u9;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar = lb.a;
        m mVar2 = new m("closed", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("viewerCanClose", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("viewerCanReopen", l0.b(xVar), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar2 = r6.a;
        k.g(xVar2, "type");
        m mVar5 = new m("closedAt", xVar2, (String) null, rVar, rVar, rVar);
        u9.Companion.getClass();
        a0 a0Var = u9.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
