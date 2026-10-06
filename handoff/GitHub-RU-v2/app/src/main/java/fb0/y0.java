package fb0;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aa.w0 {
    public static final q0 Companion = new q0();

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = hb0.b.a;
        List list2 = hb0.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == y0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(gb0.o0.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(y0.class).hashCode();
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
