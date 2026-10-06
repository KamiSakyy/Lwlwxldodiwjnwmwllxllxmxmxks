package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ii implements aaShadow.w0 {
    public static final fi Companion = new fi();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.w1.a;
        List list2 = kz0.w1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ii.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.mc.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(ii.class).hashCode();
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
