package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a80 implements aaShadow.w0 {
    public static final x70 Companion = new x70();
    public final String r;

    public a80(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.p5.a;
        List list2 = h10.p5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a80) && k71.k.b(this.r, ((a80) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ru.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "a8cc17180be83ffbbf6eeb190b46da2437e211e54316ca9dfa37de0613ce2b8c";
    }

    public final String j() {
        Companion.getClass();
        return "query SubIssues($issueId: ID!) { node(id: $issueId) { __typename ...SubIssueListFragment id } id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } duplicateOf { __typename ...DuplicateOfFragment id } }  fragment SubIssueListFragment on Issue { id subIssues(first: 100) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SubIssueFragment id } } __typename }";
    }

    public final String name() {
        return "SubIssues";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("issueId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("SubIssuesQuery(issueId=", this.r, ")");
    }
}
