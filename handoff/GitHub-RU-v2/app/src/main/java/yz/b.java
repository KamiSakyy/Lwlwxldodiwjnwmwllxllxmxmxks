package yz;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import g00.f;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.gx;
import m10.mr;
import m10.su;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Item");
        List list = g00.a.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        ah.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("ProjectV2ViewItem");
        List list2 = f.a;
        s c2 = no.a.c(list2, "selections", "ProjectV2ViewItem", n2, list2);
        su.Companion.getClass();
        q0 q0Var = su.b;
        k.g(q0Var, "type");
        List r3 = l.r(new s[]{mVar3, c2, new m("item", q0Var, (String) null, rVar, rVar, r2)});
        ch.Companion.getClass();
        m mVar4 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        mr.Companion.getClass();
        m mVar5 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        gx.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, new m("nodes", l0.a(gx.a), (String) null, rVar, rVar, r3)});
    }
}
