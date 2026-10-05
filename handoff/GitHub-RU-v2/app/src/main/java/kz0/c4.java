package kz0;

import java.util.List;
import pz0.jx;
import pz0.mv;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c4 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = vu0.h.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar3 = new aa.m("viewerCanPush", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar);
        mv.Companion.getClass();
        aa.q0 q0Var = mv.e;
        k71.k.g(q0Var, "type");
        jx.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("ref", q0Var, "branchInfo", rVar, no.a.s(jx.W, new aa.u0(new aa.t("qualifiedName"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("name"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
