package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xb0 implements aaShadow.w0 {
    public static final tb0 Companion = new tb0();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.m6.a;
        List list2 = en0.m6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == xb0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.uw.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(xb0.class).hashCode();
    }

    public final String i() {
        return "90004e7719d5e9f00c7761d7909e2e25291f6ad0171ec783232992066ff2a5a5";
    }

    public final String j() {
        Companion.getClass();
        return "query UserUnreadNotificationsQuery { viewer { notificationThreads(filterBy: { statuses: UNREAD } ) { totalCount } id __typename } }";
    }

    public final String name() {
        return "UserUnreadNotificationsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
