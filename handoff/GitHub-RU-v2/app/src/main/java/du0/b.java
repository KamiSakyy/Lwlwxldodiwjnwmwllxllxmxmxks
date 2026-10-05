package du0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.dt;
import pz0.ht;
import pz0.n40;
import pz0.p40;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.wt;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("id", b, (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        x xVar2 = xd.a;
        s mVar = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar2 = new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        List r2 = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Actor", r, list), new n("User", d0.n("User"), n)});
        List r3 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        n40.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(n40.a), (String) null, rVar, rVar, r3));
        vd.Companion.getClass();
        List n3 = d0.n(new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar));
        m mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar5 = new m("authorCanPushToRepository", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("author", j0Var, (String) null, rVar, rVar, r2);
        wt.Companion.getClass();
        m mVar7 = new m("state", l0.b(wt.s), (String) null, rVar, rVar, rVar);
        p40.Companion.getClass();
        r b2 = l0.b(p40.a);
        dt.Companion.getClass();
        m mVar8 = new m("onBehalfOf", b2, (String) null, rVar, no.a.s(dt.b, new u0(25)), n2);
        m mVar9 = new m("body", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ht.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("comments", l0.b(ht.a), (String) null, rVar, no.a.s(dt.a, new u0(1)), n3)});
    }
}
