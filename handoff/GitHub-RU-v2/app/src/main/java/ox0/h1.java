package ox0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 implements aa.w0 {
    public static final b1 Companion = new b1();

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = qx0.c.a;
        List list2 = qx0.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == h1.class;
    }

    public final aa.p0 g() {
        return aa.c.c(px0.x0.a, false);
    }

    public final int hashCode() {
        return k71.x.a(h1.class).hashCode();
    }

    public final String i() {
        return "1fee45130d971523536fc836d12177f7bf4145e570ad08cac6d6371e2466e02b";
    }

    public final String j() {
        Companion.getClass();
        return "query StatusAndCustomNotificationFilters { viewer { inbox: notificationThreads(query: \"is:unread\") { totalCount } notificationFilters(first: 50) { nodes { __typename ...NotificationListItem id } } id __typename } id __typename }  fragment NotificationListItem on NotificationFilter { id name unreadCount queryString isDefaultFilter __typename }";
    }

    public final String name() {
        return "StatusAndCustomNotificationFilters";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
    public static final Object i = null;
}
