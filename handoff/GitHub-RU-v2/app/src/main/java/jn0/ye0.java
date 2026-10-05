package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ye0 implements aa.w0 {
    public static final re0 Companion = new re0();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.v6.a;
        List list2 = kz0.v6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ye0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ez.a, false);
    }

    public final int hashCode() {
        return k71.x.a(ye0.class).hashCode();
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
