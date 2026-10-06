package h00;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import g00.e;
import g00.i;
import java.util.List;
import k71.k;
import m10.ah;
import m10.at;
import m10.cx;
import m10.eh;
import m10.ex;
import m10.l40;
import m10.lt;
import m10.nt;
import m10.ow;
import m10.p00;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"});
        List list = e.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2FieldCommon", r, list)});
        lt.Companion.getClass();
        List n = d0Shadow.n(new m("nodes", l0.a(lt.a), (String) null, rVar, rVar, r2));
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("ProjectV2View");
        List list2 = i.a;
        List r3 = l.r(new s[]{mVar2, mVar3, no.a.c(list2, "selections", "ProjectV2View", n2, list2)});
        List r4 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0Shadow.n("ProjectV2View"), list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        cx.Companion.getClass();
        q0 q0Var = cx.n;
        List n3 = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r4));
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        nt.Companion.getClass();
        r b2 = l0.b(nt.a);
        at.Companion.getClass();
        s mVar6 = new m("fields", b2, (String) null, rVar, no.a.s(at.a, new u0(50)), n);
        s mVar7 = new m("defaultView", q0Var, (String) null, rVar, rVar, r3);
        ex.Companion.getClass();
        s mVar8 = new m("views", l0.b(ex.a), (String) null, rVar, no.a.s(at.c, new u0(50)), n3);
        List n4 = d0Shadow.n("ProjectV2");
        List list3 = uz.c.a;
        List r5 = l.r(new s[]{mVar4, mVar5, mVar6, mVar7, mVar8, no.a.c(list3, "selections", "ProjectV2", n4, list3)});
        q0 q0Var2 = at.d;
        k.g(q0Var2, "type");
        ow.Companion.getClass();
        List r6 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2Owner", l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), d0Shadow.n(new m("projectV2", q0Var2, (String) null, rVar, no.a.s(ow.a, new u0(new t("projectNumber"))), r5)))});
        l40.Companion.getClass();
        j0 j0Var = l40.e;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(p00.t, new u0(new t("projectOwnerLogin"))), r6), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
