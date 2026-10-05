package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gr;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Organization");
        List list = dq.w.a;
        aa.s c = no.a.c(list, "selections", "Organization", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        gr.Companion.getClass();
        aa.q0 q0Var = gr.o;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var, (String) null, rVar, no.a.s(p00.j, new aa.u0(new aa.t("login"))), r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
