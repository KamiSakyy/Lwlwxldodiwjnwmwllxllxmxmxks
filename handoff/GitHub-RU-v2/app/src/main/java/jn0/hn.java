package jn0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hn implements aaShadow.n0 {
    public static final en Companion = new en();
    public ArrayList r;

    public hn(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.u2.a;
        List list2 = kz0.u2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn) && this.r.equals(((hn) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.qf.a, false);
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
        aa.c.a(aa.c.c(qz0.a.B, false)).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.g("MobileEventsUpdateMutation(events=", ")", this.r);
    }
}
