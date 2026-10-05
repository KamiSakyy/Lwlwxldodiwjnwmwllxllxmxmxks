package g00;

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
import m10.ah;
import m10.ax;
import m10.ch;
import m10.cr;
import m10.cx;
import m10.eh;
import m10.lt;
import m10.nt;
import m10.ox;
import m10.yw;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2FieldConfigurationConnection");
        List list = uz.b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2FieldConfigurationConnection", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("ProjectV2Field");
        List list2 = uz.d.a;
        s c = no.a.c(list2, "selections", "ProjectV2Field", n2, list2);
        List n3 = d0.n("ProjectV2SingleSelectField");
        List list3 = uz.h.a;
        s c2 = no.a.c(list3, "selections", "ProjectV2SingleSelectField", n3, list3);
        List n4 = d0.n("ProjectV2IterationField");
        List list4 = uz.f.a;
        List r2 = l.r(new s[]{mVar2, c, c2, no.a.c(list4, "selections", "ProjectV2IterationField", n4, list4)});
        cr.Companion.getClass();
        m mVar3 = new m("direction", l0.b(cr.s), (String) null, rVar, rVar, rVar);
        lt.Companion.getClass();
        x0 x0Var = lt.a;
        List r3 = l.r(new m[]{mVar3, new m("field", l0.b(x0Var), (String) null, rVar, rVar, r2)});
        yw.Companion.getClass();
        List n5 = d0.n(new m("nodes", l0.a(yw.a), (String) null, rVar, rVar, r3));
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"});
        List list5 = e.a;
        List n6 = d0.n(new m("nodes", l0.a(x0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2FieldCommon", l.r(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"}), l.r(new s[]{mVar4, no.a.c(list5, "selections", "ProjectV2FieldCommon", r4, list5)}))})));
        ah.Companion.getClass();
        m mVar5 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar2 = ch.a;
        k.g(xVar2, "type");
        m mVar6 = new m("databaseId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar7 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ox.Companion.getClass();
        m mVar8 = new m("layout", l0.b(ox.s), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("number", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        nt.Companion.getClass();
        q0 q0Var = nt.a;
        k.g(q0Var, "type");
        cx.Companion.getClass();
        m mVar10 = new m("groupByFields", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(cx.f, new u0((Object) null)), new aa.k(cx.g, new u0(25))}), r);
        ax.Companion.getClass();
        q0 q0Var2 = ax.a;
        k.g(q0Var2, "type");
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("sortByFields", q0Var2, (String) null, rVar, l.r(new aa.k[]{new aa.k(cx.l, new u0((Object) null)), new aa.k(cx.m, new u0(25))}), n5), new m("fields", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(cx.a, new u0((Object) null)), new aa.k(cx.b, new u0(25)), new aa.k(cx.c, new u0((Object) null))}), n6), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
