package ng0;

import aa.a0;
import aa.m;
import aa.r;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import gn0.xc;
import gn0.zc;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xc.Companion.getClass();
        m mVar2 = new m("state", l0.b(xc.s), (String) null, rVar, rVar, rVar);
        zc.Companion.getClass();
        a0 a0Var = zc.s;
        k.g(a0Var, "type");
        m mVar3 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar4 = new m("viewerCanReopen", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
