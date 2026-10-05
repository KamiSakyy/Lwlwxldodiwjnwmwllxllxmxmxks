package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gr;
import m10.p00;
import m10.rf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h7 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = rx.i.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("Organization");
        List list2 = uu.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Organization", n2, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        aa.m mVar3 = new aa.m("user", q0Var, (String) null, rVar, no.a.s(p00.E, new aa.u0(new aa.t("login"))), r);
        gr.Companion.getClass();
        aa.q0 q0Var2 = gr.o;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar3, new aa.m("organization", q0Var2, (String) null, rVar, no.a.s(p00.j, new aa.u0(new aa.t("login"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
