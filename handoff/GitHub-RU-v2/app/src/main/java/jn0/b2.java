package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 implements aaShadow.n0 {
    public static final x1 Companion = new x1();
    public pz0.i0 r;

    public b2(pz0.i0 i0Var) {
        this.r = i0Var;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.l.a;
        List list2 = kz0.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && k71.k.b(this.r, ((b2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.b1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "26fda1e1a14c01130824b33408d61d6e5b9f6d2ce0ab9734cb8a9d958f250f6f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddSubIssue($addSubIssueInput: AddSubIssueInput!) { addSubIssue(input: $addSubIssueInput) { issue { __typename id url ...SubIssueListFragment ...SubIssueProgressFragment } subIssue { __typename id url ...ParentIssueFragment } } }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } }  fragment SubIssueListFragment on Issue { id subIssues(first: 100) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SubIssueFragment id } } __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state __typename } id __typename }";
    }

    public final String name() {
        return "AddSubIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("addSubIssueInput");
        aa.c.c(qz0.a.b, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "AddSubIssueMutation(addSubIssueInput=" + this.r + ")";
    }
}
