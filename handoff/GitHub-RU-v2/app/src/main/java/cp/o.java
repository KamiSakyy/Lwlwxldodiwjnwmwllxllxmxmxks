package cp;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.vg0;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("WorkflowConnection");
        List list = wo.g.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "WorkflowConnection", n, list)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vg0.Companion.getClass();
        r b2 = l0.b(vg0.a);
        i30.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("workflows", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.t0, new u0(new t("after"))), new aa.k(i30.u0, new u0(new t("first"))), new aa.k(i30.v0, new u0(x61.x.u(new w61.k[]{new w61.k("direction", "ASC"), new w61.k("field", "NAME")})))}), r), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repositoryName"))), new aa.k(p00.m, new u0(new t("repositoryOwner")))}), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
