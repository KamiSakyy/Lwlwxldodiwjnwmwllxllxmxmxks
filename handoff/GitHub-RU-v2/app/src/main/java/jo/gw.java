package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gw implements aaShadow.n0 {
    public static final zv Companion = new zv();
    public final m10.k20 r;

    public gw(m10.k20 k20Var) {
        this.r = k20Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.x3.a;
        List list2 = h10.x3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw) && k71.k.b(this.r, ((gw) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.cm.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "34096dd7c1f06f2087f2356398ef6e72fcc6588503680759b5fe48125d153912";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemoveSubIssue($removeSubIssueInput: RemoveSubIssueInput!) { removeSubIssue(input: $removeSubIssueInput) { issue { __typename id url parent { __typename ...SubIssueProgressFragment id } ...SubIssueFragment } subIssue { id parent { id __typename } __typename } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } duplicateOf { __typename ...DuplicateOfFragment id } }";
    }

    public final String name() {
        return "RemoveSubIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("removeSubIssueInput");
        aa.c.c(n10.b.w, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "RemoveSubIssueMutation(removeSubIssueInput=" + this.r + ")";
    }
}
