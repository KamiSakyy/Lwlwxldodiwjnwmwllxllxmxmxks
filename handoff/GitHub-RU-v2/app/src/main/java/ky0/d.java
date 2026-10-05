package ky0;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import jy0.f;
import k71.k;
import pz0.lp;
import pz0.no;
import pz0.ro;
import pz0.rr;
import pz0.su;
import pz0.td;
import pz0.vr;
import pz0.wk;
import pz0.xd;
import pz0.xr;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = jy0.a.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("ProjectV2ViewItem");
        List list2 = f.a;
        s c2 = no.a.c(list2, "selections", "ProjectV2ViewItem", n2, list2);
        lp.Companion.getClass();
        q0 q0Var = lp.b;
        k.g(q0Var, "type");
        List r2 = l.r(new s[]{mVar2, c2, new m("item", q0Var, (String) null, rVar, rVar, r)});
        vr.Companion.getClass();
        List n3 = d0.n(new m("nodes", l0.a(vr.a), (String) null, rVar, rVar, r2));
        xr.Companion.getClass();
        r b2 = l0.b(xr.a);
        no.Companion.getClass();
        List n4 = d0.n(new m("nodes", l0.a(no.c), (String) null, rVar, rVar, l.r(new m[]{new m("items", b2, (String) null, rVar, no.a.s(no.b, new u0(1)), n3), new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        ro.Companion.getClass();
        r b3 = l0.b(ro.a);
        rr.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), d0.n(new m("groups", b3, (String) null, rVar, l.r(new aa.k[]{new aa.k(rr.i, new u0(1)), new aa.k(rr.k, new u0(d0.n(new t("fullDatabaseId"))))}), n4))), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("selectedViewId"))), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
