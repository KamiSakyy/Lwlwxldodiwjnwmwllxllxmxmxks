package zz;

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
import m10.ah;
import m10.ch;
import m10.cx;
import m10.eh;
import m10.mr;
import m10.p00;
import m10.st;
import m10.wg;
import m10.wt;
import m10.zp;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
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
        List n = d0Shadow.n("ProjectV2Group");
        List list = yz.c.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "ProjectV2Group", n, list), new m("viewGroupId", xVar2, (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar3 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        mr.Companion.getClass();
        m mVar4 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        st.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, mVar4, new m("nodes", l0.a(st.c), (String) null, rVar, rVar, r2)});
        ah.Companion.getClass();
        x xVar3 = ah.a;
        m mVar5 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        wt.Companion.getClass();
        r b2 = l0.b(wt.a);
        cx.Companion.getClass();
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0Shadow.n("ProjectV2View"), l.r(new m[]{mVar5, new m("groups", b2, (String) null, rVar, l.r(new aa.k[]{new aa.k(cx.h, new u0(new t("after"))), new aa.k(cx.i, new u0(new t("first"))), new aa.k(cx.j, new u0(new t("query")))}), r3)}))});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("viewId"))), r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
