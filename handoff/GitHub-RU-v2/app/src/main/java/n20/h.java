package n20;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.pm;
import hc0.yg;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("Commit");
        List list = h20.d.a;
        List r = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Commit", d0.n("Commit"), x61.l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Commit", n, list)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("id"))), r));
    }
}
