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
import dq.w;
import g00.i;
import java.util.List;
import k71.k;
import m10.ah;
import m10.at;
import m10.cx;
import m10.eh;
import m10.ex;
import m10.l40;
import m10.ow;
import m10.p00;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2View");
        List list = i.a;
        List r = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "ProjectV2View", n, list)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2View", d0.n("ProjectV2View"), list)});
        cx.Companion.getClass();
        q0 q0Var = cx.n;
        List n2 = d0.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r2));
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("ProjectV2");
        List list2 = uz.i.a;
        s c = no.a.c(list2, "selections", "ProjectV2", n3, list2);
        s mVar4 = new m("defaultView", q0Var, (String) null, rVar, rVar, r);
        ex.Companion.getClass();
        r b2 = l0.b(ex.a);
        at.Companion.getClass();
        List r3 = l.r(new s[]{mVar3, c, mVar4, new m("views", b2, (String) null, rVar, no.a.s(at.c, new u0(50)), n2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = at.d;
        k.g(q0Var2, "type");
        ow.Companion.getClass();
        List n4 = d0.n(new m("projectV2", q0Var2, (String) null, rVar, no.a.s(ow.a, new u0(new t("projectNumber"))), r3));
        s mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n5 = d0.n("Organization");
        List list3 = w.a;
        List r4 = l.r(new s[]{mVar5, mVar6, no.a.c(list3, "selections", "Organization", n5, list3), new n("ProjectV2Owner", l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), n4)});
        l40.Companion.getClass();
        j0 j0Var = l40.e;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(p00.t, new u0(new t("projectOwnerLogin"))), r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
