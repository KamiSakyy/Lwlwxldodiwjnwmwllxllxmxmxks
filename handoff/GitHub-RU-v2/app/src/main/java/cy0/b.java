package cy0;

import aa.j0;
import aa.k;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.no;
import pz0.rr;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import pz0.xr;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2ViewItemConnection");
        List list = by0.b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2ViewItemConnection", n, list)});
        m mVar2 = new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar);
        xr.Companion.getClass();
        r b2 = l0.b(xr.a);
        no.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(no.a, new u0(new t("after"))), new k(no.b, new u0(new t("first")))}), r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q0 q0Var = no.c;
        k71.k.g(q0Var, "type");
        rr.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), l.r(new m[]{mVar3, new m("group", q0Var, (String) null, rVar, l.r(new k[]{new k(rr.d, new u0(new t("query"))), new k(rr.e, new u0(new t("groupId")))}), r2)}))});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("viewId"))), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
