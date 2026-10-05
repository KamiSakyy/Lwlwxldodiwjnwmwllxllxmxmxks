package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h8 implements aa.n0 {
    public static final c8 Companion = new c8();
    public final m10.l9 r;

    public h8(m10.l9 l9Var) {
        this.r = l9Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.j0.a;
        List list2 = h10.j0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8) && k71.k.b(this.r, ((h8) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.k5.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "a92b108da1a5e4f53f567093c7d29b933c470aa7eaf11b4be8903d0b649b0089";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateIssue($createIssueInput: CreateIssueInput!) { createIssue(input: $createIssueInput) { issue { __typename id url number parent { __typename ...SubIssueProgressFragment id } ...SubIssueFragment } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } duplicateOf { __typename ...DuplicateOfFragment id } }";
    }

    public final String name() {
        return "CreateIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("createIssueInput");
        aa.c.c(n10.a.s, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateIssueMutation(createIssueInput=" + this.r + ")";
    }
}
