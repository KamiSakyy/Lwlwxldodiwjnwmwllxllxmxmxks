package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fj implements aaShadow.w0 {
    public static final cj Companion = new cj();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.z1.a;
        List list2 = h10.z1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == fj.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.cd.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(fj.class).hashCode();
    }

    public final String i() {
        return "b7370b92cbc68cda6fa36c8ec110c20baf3b5e97da6a77f2b81c6eec721fc710";
    }

    public final String j() {
        Companion.getClass();
        return "query Home { viewer { __typename id login isEmployee ...avatarFragment ...HomeRecentActivity } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment HomeRecentActivity on User { recentInteractions(limit: 10) { interaction occurredAt commenter { __typename login ...avatarFragment id } interactable { __typename ... on PullRequest { id url title number totalCommentsCount pullRequestState: state pullComments: comments { totalCount } isReadByViewer isDraft createdAt repository { id name owner { __typename id login ...avatarFragment } __typename } isInMergeQueue } ... on Issue { id url title number issueState: state issueComments: comments { totalCount } isReadByViewer createdAt repository { id name owner { __typename id login ...avatarFragment } __typename } stateReason } } } id __typename }";
    }

    public final String name() {
        return "Home";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
