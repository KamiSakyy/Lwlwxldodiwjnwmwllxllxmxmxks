package xi0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.fm;
import gn0.jm;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.sw;
import gn0.tb;
import gn0.uw;
import gn0.xm;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("id", b, (String) null, rVar, rVar, rVar));
        tb.Companion.getClass();
        x xVar2 = tb.a;
        s mVar = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar2 = new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.b.a;
        List r2 = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Actor", r, list), new n("User", d0Shadow.n("User"), n)});
        List r3 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        sw.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(sw.a), (String) null, rVar, rVar, r3));
        rb.Companion.getClass();
        List n3 = d0Shadow.n(new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar));
        m mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar5 = new m("authorCanPushToRepository", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("author", j0Var, (String) null, rVar, rVar, r2);
        xm.Companion.getClass();
        m mVar7 = new m("state", l0.b(xm.s), (String) null, rVar, rVar, rVar);
        uw.Companion.getClass();
        r b2 = l0.b(uw.a);
        fm.Companion.getClass();
        m mVar8 = new m("onBehalfOf", b2, (String) null, rVar, no.a.s(fm.b, new u0(25)), n2);
        m mVar9 = new m("body", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        jm.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("comments", l0.b(jm.a), (String) null, rVar, no.a.s(fm.a, new u0(1)), n3)});
    }
}
