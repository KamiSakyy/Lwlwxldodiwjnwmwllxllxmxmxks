package ey0;

import aa.j0;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.dr;
import pz0.ny;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.zn;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
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
        dr.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("projectsV2", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(dr.b, new u0(new t("after"))), new aa.k(dr.c, new u0(new t("number"))), new aa.k(dr.e, new u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "RELEVANCE")))), new aa.k(dr.f, new u0(new t("query")))}), r)});
        s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Organization");
        List list2 = bp0.r.a;
        List r3 = x61.l.r(new s[]{mVar3, mVar4, no.a.c(list2, "selections", "Organization", n2, list2), new n("ProjectV2Owner", x61.l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), r2)});
        ny.Companion.getClass();
        j0 j0Var = ny.e;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(su.n, new u0(new t("ownerLogin"))), r3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
