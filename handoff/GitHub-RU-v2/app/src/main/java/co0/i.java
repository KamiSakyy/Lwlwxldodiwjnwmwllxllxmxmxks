package co0;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.d30;
import pz0.l30;
import pz0.n30;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("StatusContext");
        List list = wn0.e.a;
        s c = no.a.c(list, "selections", "StatusContext", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        n30.Companion.getClass();
        aa.m mVar2 = new aa.m("state", l0.b(n30.s), (String) null, rVar, rVar, rVar);
        l30.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("contexts", no.a.d(l30.c), (String) null, rVar, rVar, r), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        d30.Companion.getClass();
        q0 q0Var = d30.a;
        k71.k.g(q0Var, "type");
        s mVar5 = new aa.m("status", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0.n("Commit");
        List list2 = wn0.d.a;
        List r3 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Commit", d0.n("Commit"), x61.l.r(new s[]{mVar3, mVar4, mVar5, no.a.c(list2, "selections", "Commit", n2, list2)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("id"))), r3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
