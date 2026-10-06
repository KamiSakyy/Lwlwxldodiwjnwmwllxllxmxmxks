package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hz implements aaShadow.w0 {
    public static final az Companion = new az();
    public aa.u0 r;

    public hz(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.m4.a;
        List list2 = fc0.m4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz) && this.r.equals(((hz) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ao.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "bfbebb11ae7f3d6a6f350e44ef35558d6e49ff85c40f5bfe8f980c1aa7ecd4c5";
    }

    public final String j() {
        Companion.getClass();
        return "query Shortcuts($number: Int = 25 ) { viewer { dashboard { shortcuts(first: $number, searchTypes: [DISCUSSIONS,ISSUES,PULL_REQUESTS]) { edges { node { __typename ...ShortcutFragment id } } } id __typename } id __typename } }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ProjectFragment on Project { id name state number __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryProjectTerm { term name negative value project { __typename ...ProjectFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "Shortcuts";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("number");
        aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return jo.f4.j(this.r, "ShortcutsQuery(number=", ")");
    }
}
