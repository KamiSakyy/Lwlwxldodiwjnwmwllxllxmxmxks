package ey0;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.zn;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Connection");
        List list = xx0.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        td.Companion.getClass();
        x xVar2 = td.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zn.Companion.getClass();
        r b2 = l0.b(zn.a);
        jx.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("projectsV2", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.O, new u0(new t("after"))), new aa.k(jx.P, new u0(new t("first"))), new aa.k(jx.Q, new u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "RELEVANCE")))), new aa.k(jx.R, new u0(new t("query")))}), r), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = jx.t0;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new u0(new t("repositoryName"))), new aa.k(su.m, new u0(new t("owner")))}), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
