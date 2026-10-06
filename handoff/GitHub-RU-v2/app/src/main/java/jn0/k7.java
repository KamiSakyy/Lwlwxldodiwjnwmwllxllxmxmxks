package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k7 implements aaShadow.n0 {
    public static final f7 Companion = new f7();
    public pz0.h6 r;

    public k7(pz0.h6 h6Var) {
        this.r = h6Var;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.g0.a;
        List list2 = kz0.g0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7) && k71.k.b(this.r, ((k7) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.u4.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "19430c6c5e126f3d7851126797cad6e9548f2d46e82fac182eed84c74c2bd332";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateIssue($createIssueInput: CreateIssueInput!) { createIssue(input: $createIssueInput) { issue { __typename id url number parent { __typename ...SubIssueProgressFragment id } ...SubIssueFragment } } }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } }";
    }

    public final String name() {
        return "CreateIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("createIssueInput");
        aa.c.c(qz0.a.h, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateIssueMutation(createIssueInput=" + this.r + ")";
    }
}
