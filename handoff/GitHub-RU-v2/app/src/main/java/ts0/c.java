package ts0;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.mi;
import pz0.qi;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.zs;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        vd.Companion.getClass();
        x xVar = vd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        zs.Companion.getClass();
        a0 a0Var = zs.s;
        k.g(a0Var, "type");
        List n2 = d0Shadow.n(new m("mergeMethod", a0Var, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        m mVar = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        qi.Companion.getClass();
        q0 q0Var = qi.a;
        k.g(q0Var, "type");
        m mVar2 = new m("entries", q0Var, (String) null, rVar, rVar, n);
        mi.Companion.getClass();
        q0 q0Var2 = mi.a;
        k.g(q0Var2, "type");
        m mVar3 = new m("configuration", q0Var2, (String) null, rVar, rVar, n2);
        m mVar4 = new m("nextEntryEstimatedTimeToMerge", xVar, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
