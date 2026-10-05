package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aa.w0 {
    public static final n1 Companion = new n1();
    public final String r;

    public r1(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.j.a;
        List list2 = dy.j.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && k71.k.b(this.r, ((r1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.v0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ade7d37e976d28d6bedddb58fe568211088e05a7ab665a59a74c0f6a26ee2a96";
    }

    public final String j() {
        Companion.getClass();
        return "query SubIssueData($issueId: ID!) { node(id: $issueId) { __typename ... on Issue { __typename ...SubIssuesFragment } id } id __typename }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state duplicateOf { __typename ...DuplicateOfFragment id } __typename } id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } duplicateOf { __typename ...DuplicateOfFragment id } }  fragment SubIssueListFragment on Issue { id subIssues(first: 100) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SubIssueFragment id } } __typename }  fragment SubIssuesFragment on Issue { __typename id ...SubIssueProgressFragment ...ParentIssueFragment ...SubIssueListFragment }";
    }

    public final String name() {
        return "SubIssueData";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("issueId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("SubIssueDataQuery(issueId=", this.r, ")");
    }
}
