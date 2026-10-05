package n20;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.ku;
import hc0.pm;
import hc0.su;
import hc0.uu;
import hc0.yg;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("StatusContext");
        List list = h20.e.a;
        s c = no.a.c(list, "selections", "StatusContext", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = x61.l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        uu.Companion.getClass();
        m mVar2 = new m("state", l0.b(uu.s), (String) null, rVar, rVar, rVar);
        su.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar2, new m("contexts", no.a.d(su.c), (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ku.Companion.getClass();
        q0 q0Var = ku.a;
        k71.k.g(q0Var, "type");
        s mVar5 = new m("status", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0.n("Commit");
        List list2 = h20.d.a;
        List r3 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Commit", d0.n("Commit"), x61.l.r(new s[]{mVar3, mVar4, mVar5, no.a.c(list2, "selections", "Commit", n2, list2)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("id"))), r3));
    }
}
