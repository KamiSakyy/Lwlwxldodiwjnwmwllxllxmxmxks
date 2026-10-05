package zz;

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
import m10.ah;
import m10.cx;
import m10.eh;
import m10.ix;
import m10.p00;
import m10.st;
import m10.zp;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2ViewItemConnection");
        List list = yz.b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2ViewItemConnection", n, list)});
        m mVar2 = new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar);
        ix.Companion.getClass();
        r b2 = l0.b(ix.a);
        st.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(st.a, new u0(new t("after"))), new k(st.b, new u0(new t("first")))}), r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q0 q0Var = st.c;
        k71.k.g(q0Var, "type");
        cx.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), l.r(new m[]{mVar3, new m("group", q0Var, (String) null, rVar, l.r(new k[]{new k(cx.d, new u0(new t("query"))), new k(cx.e, new u0(new t("groupId")))}), r2)}))});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("viewId"))), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
