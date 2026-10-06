package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 implements aaShadow.n0 {
    public static final c2 Companion = new c2();
    public m10.m0 r;

    public g2(m10.m0 m0Var) {
        this.r = m0Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.m.a;
        List list2 = h10.m.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && k71.k.b(this.r, ((g2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.e1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "e3aa9ee88c4ab4dea0fcba313f5f4a0adcca65e74f08beade671638d1f882259";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddSubIssue($addSubIssueInput: AddSubIssueInput!) { addSubIssue(input: $addSubIssueInput) { issue { __typename id url ...SubIssueListFragment ...SubIssueProgressFragment } subIssue { __typename id url ...ParentIssueFragment } } }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } duplicateOf { __typename ...DuplicateOfFragment id } }  fragment SubIssueListFragment on Issue { id subIssues(first: 100) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SubIssueFragment id } } __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state duplicateOf { __typename ...DuplicateOfFragment id } __typename } id __typename }";
    }

    public final String name() {
        return "AddSubIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("addSubIssueInput");
        aa.c.c(n10.a.b, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "AddSubIssueMutation(addSubIssueInput=" + this.r + ")";
    }
}
