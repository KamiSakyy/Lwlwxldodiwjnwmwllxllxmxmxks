package x40;

import aa.a0;
import aa.j0;
import aa.m;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.h6;
import hc0.j7;
import hc0.lk;
import hc0.v7;
import hc0.x7;
import hc0.z7;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        v7.Companion.getClass();
        a0 a0Var = v7.s;
        k.g(a0Var, "type");
        m mVar3 = new m("state", a0Var, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("environment", xVar, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        z7.Companion.getClass();
        m mVar6 = new m("state", l0.b(z7.s), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        x xVar3 = ew.a;
        k.g(xVar3, "type");
        m mVar7 = new m("environmentUrl", xVar3, (String) null, rVar, rVar, rVar);
        j7.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, mVar6, mVar7, new m("deployment", l0.b(j7.a), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r5 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        h6.Companion.getClass();
        m mVar11 = new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar);
        x7.Companion.getClass();
        m mVar12 = new m("deploymentStatus", l0.b(x7.a), (String) null, rVar, rVar, r4);
        lk.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, mVar12, new m("pullRequest", l0.b(lk.J), (String) null, rVar, rVar, r5)});
    }
}
