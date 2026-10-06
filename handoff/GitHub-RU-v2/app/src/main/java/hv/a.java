package hv;

import aa.q0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.f2;
import m10.py;
import m10.wg;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        py.Companion.getClass();
        aa.r b = l0.b(py.s);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("mergeMethod", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar = wg.a;
        aa.m mVar2 = new aa.m("viewerCanDisableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        f2.Companion.getClass();
        q0 q0Var = f2.a;
        k71.k.g(q0Var, "type");
        aa.m mVar4 = new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
