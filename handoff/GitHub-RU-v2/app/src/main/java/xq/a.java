package xq;

import aa.a0;
import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.b4;
import m10.cc0;
import m10.ch;
import m10.d4;
import m10.eh;
import m10.f4;
import m10.mc;
import m10.t3;
import m10.v3;
import m10.yb;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        cc0.Companion.getClass();
        x xVar = cc0.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("environmentUrl", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("logUrl", xVar, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        mc.Companion.getClass();
        q0 q0Var = mc.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{new m("latestStatus", q0Var, (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        b4.Companion.getClass();
        a0 a0Var = b4.s;
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("CheckStep", d0.n("CheckStep"), d0.n(new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar)))});
        ch.Companion.getClass();
        m mVar4 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        d4.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("nodes", l0.a(d4.a), (String) null, rVar, rVar, r3)});
        m mVar5 = new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        t3.Companion.getClass();
        a0 a0Var2 = t3.s;
        k.g(a0Var2, "type");
        m mVar8 = new m("conclusion", a0Var2, (String) null, rVar, rVar, rVar);
        m mVar9 = new m("permalink", l0.b(xVar), (String) null, rVar, rVar, rVar);
        yb.Companion.getClass();
        q0 q0Var2 = yb.a;
        k.g(q0Var2, "type");
        m mVar10 = new m("deployment", q0Var2, (String) null, rVar, rVar, r2);
        f4.Companion.getClass();
        q0 q0Var3 = f4.a;
        k.g(q0Var3, "type");
        v3.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("steps", q0Var3, (String) null, rVar, no.a.s(v3.d, new u0(new t("numberOfSteps"))), r4), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
