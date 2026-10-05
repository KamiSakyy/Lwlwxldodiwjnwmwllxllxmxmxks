package by0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import jy0.f;
import k71.k;
import pz0.hm;
import pz0.lp;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.vr;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = jy0.a.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        td.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("ProjectV2ViewItem");
        List list2 = f.a;
        s c2 = no.a.c(list2, "selections", "ProjectV2ViewItem", n2, list2);
        lp.Companion.getClass();
        q0 q0Var = lp.b;
        k.g(q0Var, "type");
        List r3 = l.r(new s[]{mVar3, c2, new m("item", q0Var, (String) null, rVar, rVar, r2)});
        vd.Companion.getClass();
        m mVar4 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        hm.Companion.getClass();
        m mVar5 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        vr.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, new m("nodes", l0.a(vr.a), (String) null, rVar, rVar, r3)});
    }
}
