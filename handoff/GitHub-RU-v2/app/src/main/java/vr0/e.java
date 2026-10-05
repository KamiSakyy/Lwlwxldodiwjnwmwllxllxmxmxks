package vr0;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.bf;
import pz0.df;
import pz0.le;
import pz0.pd;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("Issue");
        List list = vu0.s.a;
        List r = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Issue", n, list)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        bf.Companion.getClass();
        m mVar4 = new m("state", l0.b(bf.s), (String) null, rVar, rVar, rVar);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k.g(a0Var, "type");
        m mVar5 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar6 = new m("viewerCanReopen", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        le.Companion.getClass();
        q0 q0Var = le.A;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, new m("parent", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
