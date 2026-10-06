package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g7 implements aaShadow.n0 {
    public static final z6 Companion = new z6();
    public hc0.d5 r;
    public final aa1.b s = aa.t0.d;

    public g7(hc0.d5 d5Var) {
        this.r = d5Var;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.g0.a;
        List list2 = fc0.g0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return k71.k.b(this.r, g7Var.r) && k71.k.b(this.s, g7Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.p4.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "b945c7b34aa0439855ed090b892563e3398b07e053f50c0a65f9369a88c35cb2";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateShortcut($input: CreateDashboardSearchShortcutInput!, $number: Int = 25 ) { createDashboardSearchShortcut(input: $input) { dashboard { shortcuts(first: $number, searchTypes: [DISCUSSIONS,ISSUES,PULL_REQUESTS]) { edges { node { __typename ...ShortcutFragment id } } } id __typename } } }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ProjectFragment on Project { id name state number __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryProjectTerm { term name negative value project { __typename ...ProjectFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "CreateShortcut";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(ic0.a.f, false).b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("number");
            aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("number");
            aa.c.l.b(fVar, wVar, 25);
        }
    }

    public final String toString() {
        return "CreateShortcutMutation(input=" + this.r + ", number=" + this.s + ")";
    }
}
