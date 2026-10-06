package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ju implements aaShadow.n0 {
    public static final cu Companion = new cu();
    public pz0.nw r;

    public ju(pz0.nw nwVar) {
        this.r = nwVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.q3.a;
        List list2 = kz0.q3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju) && k71.k.b(this.r, ((ju) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.uk.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "a5dc870e6a9b2f98f5f48b58d214d9bc0f1c5e88a9c334b500e22bab2ad85a38";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemoveSubIssue($removeSubIssueInput: RemoveSubIssueInput!) { removeSubIssue(input: $removeSubIssueInput) { issue { __typename id url parent { __typename ...SubIssueProgressFragment id } ...SubIssueFragment } subIssue { id parent { id __typename } __typename } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } }";
    }

    public final String name() {
        return "RemoveSubIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("removeSubIssueInput");
        aa.c.c(qz0.b.k, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "RemoveSubIssueMutation(removeSubIssueInput=" + this.r + ")";
    }
}
