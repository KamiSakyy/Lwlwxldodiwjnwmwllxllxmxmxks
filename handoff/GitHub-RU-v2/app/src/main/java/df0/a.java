package df0;

import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.a9;
import gn0.eq;
import gn0.hr;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r3 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        hr.Companion.getClass();
        List r4 = l.r(new m[]{new m("owner", l0.b(hr.a), (String) null, rVar, rVar, r3), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        m mVar2 = new m("number", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eq.Companion.getClass();
        List r5 = l.r(new m[]{mVar2, mVar3, new m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        a9.Companion.getClass();
        q0 q0Var = a9.l;
        k.g(q0Var, "type");
        m mVar7 = new m("discussion", q0Var, (String) null, rVar, rVar, r5);
        r6.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar)});
    }
}
