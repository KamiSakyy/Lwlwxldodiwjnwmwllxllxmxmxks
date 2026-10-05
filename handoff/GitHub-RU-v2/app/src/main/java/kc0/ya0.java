package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ya0 implements aa.w0 {
    public static final ra0 Companion = new ra0();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.h6.a;
        List list2 = en0.h6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ya0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.fw.a, false);
    }

    public final int hashCode() {
        return k71.x.a(ya0.class).hashCode();
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
