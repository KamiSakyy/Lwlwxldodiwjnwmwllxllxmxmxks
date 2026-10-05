package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rg implements aa.w0 {
    public static final og Companion = new og();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.q1.a;
        List list2 = en0.q1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == rg.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.hb.a, false);
    }

    public final int hashCode() {
        return k71.x.a(rg.class).hashCode();
    }

    public final String i() {
        return "2815f1332956a406aaa84b05b9603e069f6f989e006dfe625b996d636f9e1784";
    }

    public final String j() {
        Companion.getClass();
        return "query Home { viewer { __typename id login isEmployee ...avatarFragment ...HomeRecentActivity } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment HomeRecentActivity on User { recentInteractions(limit: 10) { interaction occurredAt commenter { __typename login ...avatarFragment id } interactable { __typename ... on PullRequest { id url title number totalCommentsCount pullRequestState: state pullComments: comments { totalCount } isReadByViewer isDraft createdAt repository { id name owner { __typename id login ...avatarFragment } __typename } isInMergeQueue } ... on Issue { id url title number issueState: state issueComments: comments { totalCount } isReadByViewer createdAt repository { id name owner { __typename id login ...avatarFragment } __typename } stateReason } } } id __typename }";
    }

    public final String name() {
        return "Home";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
