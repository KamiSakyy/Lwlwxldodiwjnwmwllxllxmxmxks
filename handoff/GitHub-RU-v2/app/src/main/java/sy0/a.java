package sy0;

import aa.m;
import aa.q0;
import aa.r;
import java.util.List;
import k71.k;
import pz0.pd;
import pz0.qf;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        vd.Companion.getClass();
        r b = l0.b(vd.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        m mVar = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar2 = new m("isInOrganization", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        qf.Companion.getClass();
        q0 q0Var = qf.a;
        k.g(q0Var, "type");
        m mVar3 = new m("issueTypes", q0Var, (String) null, rVar, rVar, n);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
