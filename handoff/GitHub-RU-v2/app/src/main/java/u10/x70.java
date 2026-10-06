package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x70 implements aaShadow.n0 {
    public static final t70 Companion = new t70();
    public final hc0.tx r;

    public x70(hc0.tx txVar) {
        this.r = txVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.v5.a;
        List list2 = fc0.v5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x70) && k71.k.b(this.r, ((x70) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.cu.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "478690a08e7568f9de4adfca1cbf28ba9dfd89c095042cf7aa27fd065aa7e0fb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateShortcut($input: UpdateDashboardSearchShortcutInput!) { updateDashboardSearchShortcut(input: $input) { shortcut { __typename ...ShortcutFragment id } } }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ProjectFragment on Project { id name state number __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryProjectTerm { term name negative value project { __typename ...ProjectFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "UpdateShortcut";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(ic0.b.p, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateShortcutMutation(input=" + this.r + ")";
    }
}
