package fb0;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 implements aa.w0 {
    public static final z0 Companion = new z0();

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = hb0.c.a;
        List list2 = hb0.c.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == f1.class;
    }

    public final aa.p0 g() {
        return aa.c.c(gb0.v0.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(f1.class).hashCode();
    }

    public final String i() {
        return "af9ffc9c846fdf86cbadc25d90391a697eb41a677a6994885d817d4059e71cbf";
    }

    public final String j() {
        Companion.getClass();
        return "query StatusAndCustomNotificationFilters { viewer { inbox: notificationThreads(query: \"is:unread\") { totalCount } notificationFilters(first: 50) { nodes { __typename ...NotificationListItem id } } id __typename } }  fragment NotificationListItem on NotificationFilter { id name unreadCount queryString isDefaultFilter __typename }";
    }

    public final String name() {
        return "StatusAndCustomNotificationFilters";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
