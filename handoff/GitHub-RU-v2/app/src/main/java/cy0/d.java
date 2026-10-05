package cy0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hm;
import pz0.no;
import pz0.pd;
import pz0.ro;
import pz0.rr;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.wk;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pd.Companion.getClass();
        r b = l0.b(pd.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Group");
        List list = by0.a.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "ProjectV2Group", n, list), new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        m mVar3 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        hm.Companion.getClass();
        m mVar4 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        no.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, mVar4, new m("nodes", l0.a(no.c), (String) null, rVar, rVar, r2)});
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ro.Companion.getClass();
        r b2 = l0.b(ro.a);
        rr.Companion.getClass();
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), l.r(new m[]{mVar5, new m("groups", b2, (String) null, rVar, l.r(new aa.k[]{new aa.k(rr.h, new u0(new t("after"))), new aa.k(rr.i, new u0(new t("first")))}), r3)}))});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("viewId"))), r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
