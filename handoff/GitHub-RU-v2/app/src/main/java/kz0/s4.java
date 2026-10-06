package kz0;

import java.util.List;
import pz0.jx;
import pz0.ry;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.zd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s4 {
    public static final List a;

    static {
        zd.Companion.getClass();
        aa.x xVar = zd.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("contentHTML", xVar, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("path", xVar2, (String) null, rVar, rVar, rVar)});
        ry.Companion.getClass();
        aa.q0 q0Var = ry.a;
        k71.k.g(q0Var, "type");
        jx.Companion.getClass();
        aa.m mVar2 = new aa.m("readme", q0Var, (String) null, rVar, no.a.s(jx.V, new aa.u0(new aa.t("branchName"))), r);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("name"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
