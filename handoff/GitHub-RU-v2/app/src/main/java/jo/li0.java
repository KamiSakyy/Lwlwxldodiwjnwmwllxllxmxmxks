package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class li0 implements aaShadow.w0 {
    public static final hi0 Companion = new hi0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.j7.a;
        List list2 = h10.j7.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == li0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.o10.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(li0.class).hashCode();
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
