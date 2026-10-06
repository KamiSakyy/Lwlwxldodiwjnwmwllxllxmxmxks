package kz0;

import java.util.List;
import pz0.jx;
import pz0.mv;
import pz0.nm;
import pz0.o9;
import pz0.q9;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiffLine");
        List list = xq0.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "DiffLine", n, list)});
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q9.Companion.getClass();
        aa.p a2 = v8.l0.a(q9.a);
        nm.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("diffLines", a2, (String) null, rVar, no.a.s(nm.a, new aa.u0(new aa.t("contextLines"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = nm.b;
        k71.k.g(q0Var, "type");
        o9.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("patch", q0Var, (String) null, rVar, no.a.s(o9.a, new aa.u0(new aa.t("path"))), r2));
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = o9.d;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("diff", q0Var2, (String) null, rVar, rVar, n2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.c5.Companion.getClass();
        aa.q0 q0Var3 = pz0.c5.d;
        k71.k.g(q0Var3, "type");
        mv.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("compare", q0Var3, (String) null, rVar, no.a.s(mv.d, new aa.u0(new aa.t("headRefName"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var4 = mv.e;
        k71.k.g(q0Var4, "type");
        jx.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar5, new aa.m("ref", q0Var4, "comparison", rVar, no.a.s(jx.W, new aa.u0(new aa.t("baseRefName"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var5 = jx.t0;
        k71.k.g(q0Var5, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var5, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repoName"))), new aa.k(su.m, new aa.u0(new aa.t("ownerName")))}), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
