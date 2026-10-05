package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y80 implements aa.w0 {
    public static final r80 Companion = new r80();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.a6.a;
        List list2 = fc0.a6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == y80.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.tu.a, false);
    }

    public final int hashCode() {
        return k71.x.a(y80.class).hashCode();
    }

    public final String i() {
        return "92a4eab0169cbfb69b9c900e9a47c301401d71c29e107a3bba5b32ad9f23940e";
    }

    public final String j() {
        Companion.getClass();
        return "query UserContributions { viewer { contributionsCollection { contributionCalendar { weeks { contributionDays { contributionLevel } } } } id __typename } }";
    }

    public final String name() {
        return "UserContributions";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
