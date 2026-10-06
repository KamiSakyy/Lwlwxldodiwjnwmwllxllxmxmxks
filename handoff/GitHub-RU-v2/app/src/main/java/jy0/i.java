package jy0;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import pz0.ds;
import pz0.go;
import pz0.io;
import pz0.nr;
import pz0.pr;
import pz0.rr;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.xl;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2FieldConfigurationConnection");
        List list = xx0.b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2FieldConfigurationConnection", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("ProjectV2Field");
        List list2 = xx0.d.a;
        s c = no.a.c(list2, "selections", "ProjectV2Field", n2, list2);
        List n3 = d0Shadow.n("ProjectV2SingleSelectField");
        List list3 = xx0.h.a;
        s c2 = no.a.c(list3, "selections", "ProjectV2SingleSelectField", n3, list3);
        List n4 = d0Shadow.n("ProjectV2IterationField");
        List list4 = xx0.f.a;
        List r2 = l.r(new s[]{mVar2, c, c2, no.a.c(list4, "selections", "ProjectV2IterationField", n4, list4)});
        xl.Companion.getClass();
        m mVar3 = new m("direction", l0.b(xl.s), (String) null, rVar, rVar, rVar);
        go.Companion.getClass();
        x0 x0Var = go.a;
        List r3 = l.r(new m[]{mVar3, new m("field", l0.b(x0Var), (String) null, rVar, rVar, r2)});
        nr.Companion.getClass();
        List n5 = d0Shadow.n(new m("nodes", l0.a(nr.a), (String) null, rVar, rVar, r3));
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"});
        List list5 = e.a;
        List n6 = d0Shadow.n(new m("nodes", l0.a(x0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2FieldCommon", l.r(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"}), l.r(new s[]{mVar4, no.a.c(list5, "selections", "ProjectV2FieldCommon", r4, list5)}))})));
        td.Companion.getClass();
        m mVar5 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar2 = vd.a;
        k.g(xVar2, "type");
        m mVar6 = new m("databaseId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar7 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ds.Companion.getClass();
        m mVar8 = new m("layout", l0.b(ds.s), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("number", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        io.Companion.getClass();
        q0 q0Var = io.a;
        k.g(q0Var, "type");
        rr.Companion.getClass();
        m mVar10 = new m("groupByFields", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rr.f, new u0((Object) null)), new aa.k(rr.g, new u0(25))}), r);
        pr.Companion.getClass();
        q0 q0Var2 = pr.a;
        k.g(q0Var2, "type");
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("sortByFields", q0Var2, (String) null, rVar, l.r(new aa.k[]{new aa.k(rr.l, new u0((Object) null)), new aa.k(rr.m, new u0(25))}), n5), new m("fields", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rr.a, new u0((Object) null)), new aa.k(rr.b, new u0(25)), new aa.k(rr.c, new u0((Object) null))}), n6), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
