package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lg0 implements aaShadow.n0 {
    public static final hg0 Companion = new hg0();
    public final m10.td0 r;

    public lg0(m10.td0 td0Var) {
        this.r = td0Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.z6.a;
        List list2 = h10.z6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg0) && k71.k.b(this.r, ((lg0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.i00.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9eddccfac64126d4ee596236c76c507641fe39f1ebe2c782863dc6a7b5006ceb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateShortcut($input: UpdateDashboardSearchShortcutInput!) { updateDashboardSearchShortcut(input: $input) { shortcut { __typename ...ShortcutFragment id } } }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "UpdateShortcut";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.c.g, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateShortcutMutation(input=" + this.r + ")";
    }
}
