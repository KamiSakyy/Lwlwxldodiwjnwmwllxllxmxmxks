package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mh0 implements aaShadow.w0 {
    public static final fh0 Companion = new fh0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.e7.a;
        List list2 = h10.e7.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == mh0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.z00.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(mh0.class).hashCode();
    }

    public final String i() {
        return "8e721a682433e9f4b9a9c95136fd3ba7523251db6add53cbbf2f7fa78760436b";
    }

    public final String j() {
        Companion.getClass();
        return "query UserContributions { viewer { contributionsCollection { contributionCalendar { weeks { contributionDays { contributionLevel } } } } id __typename } id __typename }";
    }

    public final String name() {
        return "UserContributions";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
