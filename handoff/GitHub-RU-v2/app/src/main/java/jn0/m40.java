package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m40 implements aaShadow.n0 {
    public static final i40 Companion = new i40();
    public final pz0.d20 r;

    public m40(pz0.d20 d20Var) {
        this.r = d20Var;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.c5.a;
        List list2 = kz0.c5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m40) && k71.k.b(this.r, ((m40) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.cs.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "fcc4b411ec25c1fc9d77786b45af1236b9b8e314f38536d45f33869403e696cd";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SetShortcuts($input: SetDashboardSearchShortcutsInput!) { setDashboardSearchShortcuts(input: $input) { shortcuts { __typename ...ShortcutFragment id } } }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "SetShortcuts";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(qz0.b.u, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "SetShortcutsMutation(input=" + this.r + ")";
    }
}
