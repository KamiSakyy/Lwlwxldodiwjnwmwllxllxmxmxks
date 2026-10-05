package lz;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.w0 {
    public static final a1 Companion = new a1();

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = nz.c.a;
        List list2 = nz.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g1.class;
    }

    public final aa.p0 g() {
        return aa.c.c(mz.w0.a, false);
    }

    public final int hashCode() {
        return k71.x.a(g1.class).hashCode();
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
}
