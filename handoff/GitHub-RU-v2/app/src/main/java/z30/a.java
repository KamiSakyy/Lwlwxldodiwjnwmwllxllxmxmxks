package z30;

import aa.a0;
import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.ew;
import hc0.fb;
import hc0.j2;
import hc0.j7;
import hc0.l2;
import hc0.p2;
import hc0.r2;
import hc0.t2;
import hc0.x7;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ew.Companion.getClass();
        x xVar = ew.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("environmentUrl", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("logUrl", xVar, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar3 = fb.a;
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        x7.Companion.getClass();
        q0 q0Var = x7.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{new m("latestStatus", q0Var, (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        p2.Companion.getClass();
        a0 a0Var = p2.s;
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("CheckStep", d0.n("CheckStep"), d0.n(new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar)))});
        db.Companion.getClass();
        m mVar4 = new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        r2.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("nodes", l0.a(r2.a), (String) null, rVar, rVar, r3)});
        m mVar5 = new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("status", l0.b(a0Var), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        j2.Companion.getClass();
        a0 a0Var2 = j2.s;
        k.g(a0Var2, "type");
        m mVar8 = new m("conclusion", a0Var2, (String) null, rVar, rVar, rVar);
        m mVar9 = new m("permalink", l0.b(xVar), (String) null, rVar, rVar, rVar);
        j7.Companion.getClass();
        q0 q0Var2 = j7.a;
        k.g(q0Var2, "type");
        m mVar10 = new m("deployment", q0Var2, (String) null, rVar, rVar, r2);
        t2.Companion.getClass();
        q0 q0Var3 = t2.a;
        k.g(q0Var3, "type");
        l2.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("steps", q0Var3, (String) null, rVar, no.a.s(l2.d, new u0(new t("numberOfSteps"))), r4), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
