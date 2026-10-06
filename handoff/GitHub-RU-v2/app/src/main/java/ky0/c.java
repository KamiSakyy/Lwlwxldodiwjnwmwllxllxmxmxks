package ky0;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import jy0.i;
import k71.k;
import pz0.dr;
import pz0.ny;
import pz0.rr;
import pz0.su;
import pz0.td;
import pz0.tr;
import pz0.xd;
import pz0.xn;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2View");
        List list = i.a;
        List r = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "ProjectV2View", n, list)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0Shadow.n("ProjectV2View"), list)});
        rr.Companion.getClass();
        q0 q0Var = rr.n;
        List n2 = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r2));
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("ProjectV2");
        List list2 = xx0.i.a;
        s c = no.a.c(list2, "selections", "ProjectV2", n3, list2);
        s mVar4 = new m("defaultView", q0Var, (String) null, rVar, rVar, r);
        tr.Companion.getClass();
        r b2 = l0.b(tr.a);
        xn.Companion.getClass();
        List r3 = l.r(new s[]{mVar3, c, mVar4, new m("views", b2, (String) null, rVar, no.a.s(xn.c, new u0(50)), n2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = xn.d;
        k.g(q0Var2, "type");
        dr.Companion.getClass();
        List n4 = d0Shadow.n(new m("projectV2", q0Var2, (String) null, rVar, no.a.s(dr.a, new u0(new t("projectNumber"))), r3));
        s mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n5 = d0Shadow.n("Organization");
        List list3 = bp0.r.a;
        List r4 = l.r(new s[]{mVar5, mVar6, no.a.c(list3, "selections", "Organization", n5, list3), new n("ProjectV2Owner", l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), n4)});
        ny.Companion.getClass();
        j0 j0Var = ny.e;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(su.n, new u0(new t("projectOwnerLogin"))), r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
