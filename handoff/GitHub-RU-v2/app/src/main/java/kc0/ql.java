package kc0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ql implements aaShadow.n0 {
    public static final nl Companion = new nl();
    public ArrayList r;

    public ql(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.o2.a;
        List list2 = en0.o2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql) && this.r.equals(((ql) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ke.a, false);
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
        aa.c.a(aa.c.c(hn0.a.x, false)).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.g("MobileEventsUpdateMutation(events=", ")", this.r);
    }
}
