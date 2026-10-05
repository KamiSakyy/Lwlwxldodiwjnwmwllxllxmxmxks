package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.q30;
import m10.ub0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = dq.g0.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(i30.w0), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q30.Companion.getClass();
        aa.r b2 = v8.l0.b(q30.a);
        ub0.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ub0.b, new aa.u0(5)), new aa.k(ub0.c, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", "DESC"), new w61.k("field", "STARGAZERS")})))}), n2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = ub0.d;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("topic", q0Var, (String) null, rVar, no.a.s(p00.z, new aa.u0("awesome")), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
