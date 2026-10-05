package lf0;

import aa.a0;
import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.f8;
import gn0.h8;
import gn0.j8;
import gn0.mx;
import gn0.pb;
import gn0.r6;
import gn0.t7;
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
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        j8.Companion.getClass();
        m mVar3 = new m("state", l0.b(j8.s), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        x xVar2 = mx.a;
        k.g(xVar2, "type");
        m mVar4 = new m("environmentUrl", xVar2, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar3 = pb.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        f8.Companion.getClass();
        a0 a0Var = f8.s;
        k.g(a0Var, "type");
        m mVar6 = new m("state", a0Var, (String) null, rVar, rVar, rVar);
        m mVar7 = new m("environment", xVar, (String) null, rVar, rVar, rVar);
        h8.Companion.getClass();
        q0 q0Var = h8.a;
        k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar5, mVar6, mVar7, new m("latestStatus", q0Var, (String) null, rVar, rVar, r3), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        t7.Companion.getClass();
        m mVar11 = new m("deployment", l0.b(t7.a), (String) null, rVar, rVar, r4);
        r6.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar)});
    }
}
