package ey0;

import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.dr;
import pz0.jx;
import pz0.ny;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.zn;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Connection");
        List list = xx0.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        zn.Companion.getClass();
        r b2 = l0.b(zn.a);
        dr.Companion.getClass();
        List n2 = d0.n(new aa.m("projectsV2", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(dr.b, new u0(new t("after"))), new aa.k(dr.c, new u0(new t("number"))), new aa.k(dr.d, new u0(new t("minPermission"))), new aa.k(dr.e, new u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "RELEVANCE")))), new aa.k(dr.f, new u0(new t("query")))}), r));
        s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = x61.l.r(new s[]{mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2Owner", x61.l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), n2)});
        aa.m mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        q0 q0Var = jx.t0;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new u0(new t("repo"))), new aa.k(su.m, new u0(new t("owner")))}), r3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
