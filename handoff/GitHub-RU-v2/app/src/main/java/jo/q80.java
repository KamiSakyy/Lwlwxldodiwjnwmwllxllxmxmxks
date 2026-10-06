package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q80 implements aaShadow.n0 {
    public static final n80 Companion = new n80();
    public m10.sa0 r;

    public q80(m10.sa0 sa0Var) {
        this.r = sa0Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.s5.a;
        List list2 = h10.s5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q80) && k71.k.b(this.r, ((q80) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.bv.a, false);
    }

    public final int hashCode() {
        return this.r.a.hashCode();
    }

    public final String i() {
        return "72b78c3c5c14521436b82a935460bc1b251e1e3f4464ce13678e933290833de7";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SubscribeUserToCopilotLimited($input: SubscribeToCopilotLimitedInput!) { subscribeToCopilotLimited(input: $input) { subscribed } }";
    }

    public final String name() {
        return "SubscribeUserToCopilotLimited";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.c.d, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "SubscribeUserToCopilotLimitedMutation(input=" + this.r + ")";
    }
}
