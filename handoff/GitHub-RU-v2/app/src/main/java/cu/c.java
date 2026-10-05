package cu;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.py;
import m10.qm;
import m10.um;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ch.Companion.getClass();
        x xVar = ch.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        py.Companion.getClass();
        a0 a0Var = py.s;
        k.g(a0Var, "type");
        List n2 = d0.n(new m("mergeMethod", a0Var, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        m mVar = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        um.Companion.getClass();
        q0 q0Var = um.a;
        k.g(q0Var, "type");
        m mVar2 = new m("entries", q0Var, (String) null, rVar, rVar, n);
        qm.Companion.getClass();
        q0 q0Var2 = qm.a;
        k.g(q0Var2, "type");
        m mVar3 = new m("configuration", q0Var2, (String) null, rVar, rVar, n2);
        m mVar4 = new m("nextEntryEstimatedTimeToMerge", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
