package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xf0 implements aa.w0 {
    public static final tf0 Companion = new tf0();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.a7.a;
        List list2 = kz0.a7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == xf0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.tz.a, false);
    }

    public final int hashCode() {
        return k71.x.a(xf0.class).hashCode();
    }

    public final String i() {
        return "49001637e564fa7192312a3d31055bf5f3b31803b8d13a30bc5454c2888bd620";
    }

    public final String j() {
        Companion.getClass();
        return "query UserUnreadNotificationsQuery { viewer { notificationThreads(filterBy: { statuses: UNREAD } ) { totalCount } id __typename } id __typename }";
    }

    public final String name() {
        return "UserUnreadNotificationsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
