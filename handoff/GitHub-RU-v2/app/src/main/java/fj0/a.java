package fj0;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.d4;
import gn0.eq;
import gn0.hr;
import gn0.lb;
import gn0.ov;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import gn0.yv;
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
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        m mVar5 = new m("owner", l0.b(hr.a), (String) null, rVar, rVar, r3);
        lb.Companion.getClass();
        x xVar3 = lb.a;
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("isPrivate", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        yv.Companion.getClass();
        List r5 = l.r(new m[]{mVar6, new m("state", l0.b(yv.s), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ov.Companion.getClass();
        q0 q0Var = ov.a;
        k.g(q0Var, "type");
        List r6 = l.r(new m[]{mVar7, mVar8, new m("status", q0Var, (String) null, rVar, rVar, r5), new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar9 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar11 = new m("isCrossRepository", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar12 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        eq.Companion.getClass();
        m mVar13 = new m("commitRepository", l0.b(eq.m0), (String) null, rVar, rVar, r4);
        d4.Companion.getClass();
        q0 q0Var2 = d4.j;
        k.g(q0Var2, "type");
        m mVar14 = new m("commit", q0Var2, (String) null, rVar, rVar, r6);
        r6.Companion.getClass();
        a = l.r(new m[]{mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar)});
    }
}
