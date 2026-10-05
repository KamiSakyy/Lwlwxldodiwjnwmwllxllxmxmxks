package a80;

import aa.q0;
import aa.x;
import hc0.bb;
import hc0.f1;
import hc0.fb;
import hc0.xa;
import hc0.zk;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        zk.Companion.getClass();
        aa.r b = l0.b(zk.s);
        x61.r rVar = x61.r.r;
        List n = d0.n(new aa.m("mergeMethod", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar = xa.a;
        aa.m mVar2 = new aa.m("viewerCanDisableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        f1.Companion.getClass();
        q0 q0Var = f1.a;
        k71.k.g(q0Var, "type");
        aa.m mVar4 = new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n);
        fb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
