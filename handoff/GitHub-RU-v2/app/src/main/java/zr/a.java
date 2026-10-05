package zr;

import aa.a0;
import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.kc;
import m10.mc;
import m10.oc;
import m10.sa;
import m10.yb;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        oc.Companion.getClass();
        m mVar3 = new m("state", l0.b(oc.s), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar2 = cc0.a;
        k.g(xVar2, "type");
        m mVar4 = new m("environmentUrl", xVar2, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar3 = ah.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        kc.Companion.getClass();
        a0 a0Var = kc.s;
        k.g(a0Var, "type");
        m mVar6 = new m("state", a0Var, (String) null, rVar, rVar, rVar);
        m mVar7 = new m("environment", xVar, (String) null, rVar, rVar, rVar);
        mc.Companion.getClass();
        q0 q0Var = mc.a;
        k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar5, mVar6, mVar7, new m("latestStatus", q0Var, (String) null, rVar, rVar, r3), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        yb.Companion.getClass();
        m mVar11 = new m("deployment", l0.b(yb.a), (String) null, rVar, rVar, r4);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
