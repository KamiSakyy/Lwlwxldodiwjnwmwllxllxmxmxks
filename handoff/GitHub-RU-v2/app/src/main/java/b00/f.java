package b00;

import aa.j0;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cx;
import m10.eh;
import m10.gx;
import m10.ix;
import m10.kx;
import m10.mx;
import m10.p00;
import m10.st;
import m10.wt;
import m10.zp;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        mx.Companion.getClass();
        r b = l0.b(mx.s);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("type", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("value", xVar, (String) null, rVar, rVar, rVar)});
        kx.Companion.getClass();
        List n = d0.n(new aa.m("sortValues", l0.a(l0.b(kx.a)), (String) null, rVar, rVar, r));
        gx.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(gx.a), (String) null, rVar, rVar, n));
        aa.m mVar2 = new aa.m("title", xVar, (String) null, rVar, rVar, rVar);
        ix.Companion.getClass();
        r b2 = l0.b(ix.a);
        st.Companion.getClass();
        List n3 = d0.n(new aa.m("nodes", l0.a(st.c), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar2, new aa.m("items", b2, (String) null, rVar, no.a.s(st.b, new u0(1)), n2), new aa.m("viewGroupId", xVar, (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.m mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wt.Companion.getClass();
        r b3 = l0.b(wt.a);
        cx.Companion.getClass();
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), x61.l.r(new aa.m[]{mVar3, new aa.m("groups", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(cx.i, new u0(1)), new aa.k(cx.k, new u0(d0.n(new t("itemDatabaseId"))))}), n3)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("viewId"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
