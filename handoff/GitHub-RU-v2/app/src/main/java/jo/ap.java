package jo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ap implements aa.n0 {
    public static final xo Companion = new xo();
    public final ArrayList r;

    public ap(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.a3.a;
        List list2 = h10.a3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && this.r.equals(((ap) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.vg.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "eb83e4c794894b7316a87c7177cf0acc7a010cb4f1e4c0947ca39b31d843b229";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MobileEventsUpdate($events: [MobileHydroEvent!]!) { mobileEventsUpdate(input: { eventsBatch: $events } ) { clientMutationId } }";
    }

    public final String name() {
        return "MobileEventsUpdate";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("events");
        aa.c.a(aa.c.c(n10.b.j, false)).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.g("MobileEventsUpdateMutation(events=", ")", this.r);
    }
}
