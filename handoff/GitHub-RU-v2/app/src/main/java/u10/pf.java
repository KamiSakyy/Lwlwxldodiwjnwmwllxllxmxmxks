package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pf implements aaShadow.w0 {
    public static final mf Companion = new mf();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.m1.a;
        List list2 = fc0.m1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == pf.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.na.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(pf.class).hashCode();
    }

    public final String i() {
        return "0641002fe9ca4be3bf551d5040c6d54c341daa49fe55dd1237fbda69bfc454a5";
    }

    public final String j() {
        Companion.getClass();
        return "query Home { viewer { __typename id login isEmployee ...avatarFragment ...HomeRecentActivity } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment HomeRecentActivity on User { recentInteractions(limit: 10) { interaction occurredAt commenter { __typename login ...avatarFragment id } interactable { __typename ... on PullRequest { id url title number totalCommentsCount pullRequestState: state pullComments: comments { totalCount } isReadByViewer isDraft createdAt repository { id name owner { __typename id login ...avatarFragment } __typename } } ... on Issue { id url title number issueState: state issueComments: comments { totalCount } isReadByViewer createdAt repository { id name owner { __typename id login ...avatarFragment } __typename } stateReason } } } id __typename }";
    }

    public final String name() {
        return "Home";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
