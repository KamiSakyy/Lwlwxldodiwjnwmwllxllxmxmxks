package dt;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import ew.t;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.wg;
import m10.wh;
import m10.wi;
import m10.yi;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Issue");
        List list = t.a;
        List r = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Issue", n, list)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Issue");
        List list2 = a.a;
        List r2 = l.r(new s[]{mVar3, no.a.c(list2, "selections", "Issue", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wi.Companion.getClass();
        m mVar5 = new m("state", l0.b(wi.s), (String) null, rVar, rVar, rVar);
        yi.Companion.getClass();
        a0 a0Var = yi.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar7 = new m("viewerCanReopen", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        wh.Companion.getClass();
        q0 q0Var = wh.B;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, new m("parent", q0Var, (String) null, rVar, rVar, r), new m("duplicateOf", q0Var, (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
