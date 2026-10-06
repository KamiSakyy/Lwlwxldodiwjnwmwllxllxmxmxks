package ox0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 implements aa.w0 {
    public static final s0 Companion = new s0();

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = qx0.b.a;
        List list2 = qx0.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == a1.class;
    }

    public final aa.p0 g() {
        return aa.c.c(px0.q0.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(a1.class).hashCode();
    }

    public final String i() {
        return "73aa73478d256ee2ad5ae9d10556cd405dd1dc327957a3858c63a9bb6fec39b7";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryNotificationFilters { viewer { notificationListsWithThreadCount(first: 50, statuses: [UNREAD,READ]) { nodes { unreadCount count list { __typename ...NodeIdFragment ... on Repository { id nameWithOwner owner { __typename id login ...avatarFragment } } } } } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
    }

    public final String name() {
        return "RepositoryNotificationFilters";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
