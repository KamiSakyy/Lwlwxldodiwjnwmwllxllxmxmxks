package h00;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import g00.f;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cx;
import m10.eh;
import m10.gx;
import m10.ix;
import m10.p00;
import m10.st;
import m10.su;
import m10.wt;
import m10.zp;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = g00.a.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("ProjectV2ViewItem");
        List list2 = f.a;
        s c2 = no.a.c(list2, "selections", "ProjectV2ViewItem", n2, list2);
        su.Companion.getClass();
        q0 q0Var = su.b;
        k.g(q0Var, "type");
        List r2 = l.r(new s[]{mVar2, c2, new m("item", q0Var, (String) null, rVar, rVar, r)});
        gx.Companion.getClass();
        List n3 = d0.n(new m("nodes", l0.a(gx.a), (String) null, rVar, rVar, r2));
        ix.Companion.getClass();
        r b2 = l0.b(ix.a);
        st.Companion.getClass();
        List n4 = d0.n(new m("nodes", l0.a(st.c), (String) null, rVar, rVar, l.r(new m[]{new m("items", b2, (String) null, rVar, no.a.s(st.b, new u0(1)), n3), new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        wt.Companion.getClass();
        r b3 = l0.b(wt.a);
        cx.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), d0.n(new m("groups", b3, (String) null, rVar, l.r(new aa.k[]{new aa.k(cx.i, new u0(1)), new aa.k(cx.k, new u0(d0.n(new t("fullDatabaseId"))))}), n4))), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("selectedViewId"))), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
