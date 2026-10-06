package u10;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mk implements aaShadow.n0 {
    public static final jk Companion = new jk();
    public ArrayList r;

    public mk(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.k2.a;
        List list2 = fc0.k2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk) && this.r.equals(((mk) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.od.a, false);
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
        aa.c.a(aa.c.c(ic0.a.x, false)).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.g("MobileEventsUpdateMutation(events=", ")", this.r);
    }
}
