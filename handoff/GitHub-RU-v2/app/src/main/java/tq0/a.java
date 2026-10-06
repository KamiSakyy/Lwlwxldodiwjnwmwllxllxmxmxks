package tq0;

import aa.a0;
import aa.j0;
import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.g9;
import pz0.h50;
import pz0.hs;
import pz0.i9;
import pz0.k9;
import pz0.o7;
import pz0.td;
import pz0.u8;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        g9.Companion.getClass();
        a0 a0Var = g9.s;
        k.g(a0Var, "type");
        m mVar3 = new m("state", a0Var, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("environment", xVar, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        k9.Companion.getClass();
        m mVar6 = new m("state", l0.b(k9.s), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar3 = h50.a;
        k.g(xVar3, "type");
        m mVar7 = new m("environmentUrl", xVar3, (String) null, rVar, rVar, rVar);
        u8.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, mVar6, mVar7, new m("deployment", l0.b(u8.a), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r5 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar8 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar10 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        o7.Companion.getClass();
        m mVar11 = new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        i9.Companion.getClass();
        m mVar12 = new m("deploymentStatus", l0.b(i9.a), (String) null, rVar, rVar, r4);
        hs.Companion.getClass();
        a = l.r(new m[]{mVar8, mVar9, mVar10, mVar11, mVar12, new m("pullRequest", l0.b(hs.N), (String) null, rVar, rVar, r5)});
    }
}
