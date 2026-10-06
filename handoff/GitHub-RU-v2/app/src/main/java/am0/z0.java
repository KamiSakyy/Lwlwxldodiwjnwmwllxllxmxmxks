package am0;

import gn0.rn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements aa.w0 {
    public static final r0 Companion = new r0();

    public final aa.m d() {
        rn.Companion.getClass();
        aa.q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = cm0.b.a;
        List list2 = cm0.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == z0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(bm0.p0.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(z0.class).hashCode();
    }

    public final String i() {
        return "f894d3028ccc862bfa6044e899c4e58876301bbae07435ad4a8ddc57313d0431";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryNotificationFilters { viewer { notificationListsWithThreadCount(first: 50, statuses: [UNREAD,READ]) { nodes { unreadCount count list { __typename ...NodeIdFragment ... on Repository { id nameWithOwner owner { __typename id login ...avatarFragment } } } } } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
    }

    public final String name() {
        return "RepositoryNotificationFilters";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
