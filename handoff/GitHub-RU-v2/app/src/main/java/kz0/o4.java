package kz0;

import java.util.List;
import pz0.jx;
import pz0.ki;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o4 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ki.Companion.getClass();
        aa.q0 q0Var = ki.c;
        k71.k.g(q0Var, "type");
        jx.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("mergeQueue", q0Var, (String) null, rVar, no.a.s(jx.D, new aa.u0(new aa.t("branchName"))), r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("name"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r2), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
