package vp0;

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
import pz0.a3;
import pz0.e3;
import pz0.g3;
import pz0.h50;
import pz0.i3;
import pz0.i9;
import pz0.td;
import pz0.u8;
import pz0.vd;
import pz0.xd;
import pz0.y2;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        h50.Companion.getClass();
        x xVar = h50.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("environmentUrl", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("logUrl", xVar, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar3 = xd.a;
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        i9.Companion.getClass();
        q0 q0Var = i9.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{new m("latestStatus", q0Var, (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        e3.Companion.getClass();
        a0 a0Var = e3.s;
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("CheckStep", d0Shadow.n("CheckStep"), d0Shadow.n(new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar)))});
        vd.Companion.getClass();
        m mVar4 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        g3.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("nodes", l0.a(g3.a), (String) null, rVar, rVar, r3)});
        m mVar5 = new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        y2.Companion.getClass();
        a0 a0Var2 = y2.s;
        k.g(a0Var2, "type");
        m mVar8 = new m("conclusion", a0Var2, (String) null, rVar, rVar, rVar);
        m mVar9 = new m("permalink", l0.b(xVar), (String) null, rVar, rVar, rVar);
        u8.Companion.getClass();
        q0 q0Var2 = u8.a;
        k.g(q0Var2, "type");
        m mVar10 = new m("deployment", q0Var2, (String) null, rVar, rVar, r2);
        i3.Companion.getClass();
        q0 q0Var3 = i3.a;
        k.g(q0Var3, "type");
        a3.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("steps", q0Var3, (String) null, rVar, no.a.s(a3.d, new u0(new t("numberOfSteps"))), r4), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
