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
import jy0.e;
import jy0.i;
import k71.k;
import pz0.dr;
import pz0.go;
import pz0.io;
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
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"});
        List list = e.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2FieldCommon", r, list)});
        go.Companion.getClass();
        List n = d0Shadow.n(new m("nodes", l0.a(go.a), (String) null, rVar, rVar, r2));
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("ProjectV2View");
        List list2 = i.a;
        List r3 = l.r(new s[]{mVar2, mVar3, no.a.c(list2, "selections", "ProjectV2View", n2, list2)});
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0Shadow.n("ProjectV2View"), list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rr.Companion.getClass();
        q0 q0Var = rr.n;
        List n3 = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r4));
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        io.Companion.getClass();
        r b2 = l0.b(io.a);
        xn.Companion.getClass();
        s mVar6 = new m("fields", b2, (String) null, rVar, no.a.s(xn.a, new u0(50)), n);
        s mVar7 = new m("defaultView", q0Var, (String) null, rVar, rVar, r3);
        tr.Companion.getClass();
        s mVar8 = new m("views", l0.b(tr.a), (String) null, rVar, no.a.s(xn.c, new u0(50)), n3);
        List n4 = d0Shadow.n("ProjectV2");
        List list3 = xx0.c.a;
        List r5 = l.r(new s[]{mVar4, mVar5, mVar6, mVar7, mVar8, no.a.c(list3, "selections", "ProjectV2", n4, list3)});
        q0 q0Var2 = xn.d;
        k.g(q0Var2, "type");
        dr.Companion.getClass();
        List r6 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2Owner", l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), d0Shadow.n(new m("projectV2", q0Var2, (String) null, rVar, no.a.s(dr.a, new u0(new t("projectNumber"))), r5)))});
        ny.Companion.getClass();
        j0 j0Var = ny.e;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(su.n, new u0(new t("projectOwnerLogin"))), r6), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
