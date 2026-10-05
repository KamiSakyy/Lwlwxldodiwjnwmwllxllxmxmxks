package n20;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.o00;
import hc0.pm;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("WorkflowConnection");
        List list = h20.g.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "WorkflowConnection", n, list)});
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        o00.Companion.getClass();
        r b2 = l0.b(o00.a);
        ap.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar2, new m("workflows", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.h0, new u0(new t("after"))), new aa.k(ap.i0, new u0(new t("first"))), new aa.k(ap.j0, new u0(x61.x.u(new w61.k[]{new w61.k("direction", "ASC"), new w61.k("field", "NAME")})))}), r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new u0(new t("repositoryName"))), new aa.k(pm.j, new u0(new t("repositoryOwner")))}), r2));
    }
}
