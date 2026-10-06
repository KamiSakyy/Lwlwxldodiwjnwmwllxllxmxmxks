package si0;

import aa.q0;
import aa.x;
import gn0.bm;
import gn0.h1;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        bm.Companion.getClass();
        aa.r b = l0.b(bm.s);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("mergeMethod", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar = lb.a;
        aa.m mVar2 = new aa.m("viewerCanDisableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h1.Companion.getClass();
        q0 q0Var = h1.a;
        k71.k.g(q0Var, "type");
        aa.m mVar4 = new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n);
        tb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
