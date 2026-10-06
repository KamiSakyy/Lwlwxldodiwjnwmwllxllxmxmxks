package h10;

import java.util.List;
import m10.ab;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        ab.Companion.getClass();
        aa.q0 q0Var = ab.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("deleteDiscussion", q0Var, (String) null, rVar, no.a.s(vp.O, new aa.u0(a0.s0.p("id", new aa.t("discussionId")))), n));
    }
}
