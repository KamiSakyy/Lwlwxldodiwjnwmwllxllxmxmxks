package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b9 implements aaShadow.n0 {
    public static final u8 Companion = new u8();
    public m10.e9 r;
    public final aa1.b s = aa.t0.d;

    public b9(m10.e9 e9Var) {
        this.r = e9Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.m0.a;
        List list2 = h10.m0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return k71.k.b(this.r, b9Var.r) && k71.k.b(this.s, b9Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.x5.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "c65fb41e1de32e2f4d36ec3ec9e636d4d422c39d2910ec045811c243b2f83356";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateShortcut($input: CreateDashboardSearchShortcutInput!, $number: Int = 25 ) { createDashboardSearchShortcut(input: $input) { dashboard { shortcuts(first: $number, searchTypes: [DISCUSSIONS,ISSUES,PULL_REQUESTS]) { edges { node { __typename ...ShortcutFragment id } } } id __typename } } }  fragment labelFields on Label { __typename id name color }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment ShortcutFragment on SearchShortcut { color icon id name query scopingRepository { id name owner { id login } __typename } searchType queryTerms { __typename ... on SearchShortcutQueryLabelTerm { term name negative value label { __typename ...labelFields id } } ... on SearchShortcutQueryLoginRefTerm { term name negative value loginRef { __typename ... on Node { id } ... on Actor { __typename login url ...avatarFragment } ... on User { name id } ... on Organization { name descriptionHTML viewerIsFollowing id } } } ... on SearchShortcutQueryMilestoneTerm { term name negative value milestone { __typename ...MilestoneFragment id } } ... on SearchShortcutQueryRepoTerm { term name negative value repository { __typename ...SimpleRepositoryFragment id } } ... on SearchShortcutQueryCategoryTerm { term name negative value discussionCategory { __typename ...DiscussionCategoryFragment id } } ... on SearchShortcutQueryTerm { term name negative value } ... on SearchShortcutQueryText { term } } __typename }";
    }

    public final String name() {
        return "CreateShortcut";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.a.r, false).b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("number");
            aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("number");
            aa.c.l.b(fVar, wVar, 25);
        }
    }

    public final String toString() {
        return "CreateShortcutMutation(input=" + this.r + ", number=" + this.s + ")";
    }
}
