package pe0;

import aa.a0;
import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.h8;
import gn0.l2;
import gn0.mx;
import gn0.n2;
import gn0.pb;
import gn0.r2;
import gn0.rb;
import gn0.t2;
import gn0.t7;
import gn0.tb;
import gn0.v2;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        mx.Companion.getClass();
        x xVar = mx.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("environmentUrl", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("logUrl", xVar, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar3 = tb.a;
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        h8.Companion.getClass();
        q0 q0Var = h8.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{new m("latestStatus", q0Var, (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        r2.Companion.getClass();
        a0 a0Var = r2.s;
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("CheckStep", d0Shadow.n("CheckStep"), d0Shadow.n(new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar)))});
        rb.Companion.getClass();
        m mVar4 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        t2.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("nodes", l0.a(t2.a), (String) null, rVar, rVar, r3)});
        m mVar5 = new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l2.Companion.getClass();
        a0 a0Var2 = l2.s;
        k.g(a0Var2, "type");
        m mVar8 = new m("conclusion", a0Var2, (String) null, rVar, rVar, rVar);
        m mVar9 = new m("permalink", l0.b(xVar), (String) null, rVar, rVar, rVar);
        t7.Companion.getClass();
        q0 q0Var2 = t7.a;
        k.g(q0Var2, "type");
        m mVar10 = new m("deployment", q0Var2, (String) null, rVar, rVar, r2);
        v2.Companion.getClass();
        q0 q0Var3 = v2.a;
        k.g(q0Var3, "type");
        n2.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("steps", q0Var3, (String) null, rVar, no.a.s(n2.d, new u0(new t("numberOfSteps"))), r4), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
