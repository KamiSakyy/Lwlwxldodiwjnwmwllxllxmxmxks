package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u40 implements aa.w0 {
    public static final n40 Companion = new n40();
    public final aa.u0 r;

    public u40(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.d5.a;
        List list2 = kz0.d5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u40) && this.r.equals(((u40) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.gs.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "1cf17c83aa703cb4a5d636d1c1ce0aebcd2e53a7d68a68e2e973bd55af662d6c";
    }

    public final String j() {
        Companion.getClass();
        return "query Shortcuts($number: Int = 25 ) { viewer { dashboard { shortcuts(first: $number, searchTypes: [DISCUSSIONS,ISSUES,PULL_REQUESTS]) { edges { node { __typename ...ShortcutFragment id } } } id __typename } id __typename } id __typename }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "Shortcuts";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("number");
        aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return jo.f4.j(this.r, "ShortcutsQuery(number=", ")");
    }
}
