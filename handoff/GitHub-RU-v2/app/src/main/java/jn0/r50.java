package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r50 implements aaShadow.w0 {
    public static final o50 Companion = new o50();
    public final String r;

    public r50(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.h5.a;
        List list2 = kz0.h5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r50) && k71.k.b(this.r, ((r50) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ys.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "0b566ea21e86ccd3a89d3f4a4506944cfc68d65ac7e02f0b3daff510b43e4996";
    }

    public final String j() {
        Companion.getClass();
        return "query SubIssues($issueId: ID!) { node(id: $issueId) { __typename ...SubIssueListFragment id } id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } }  fragment SubIssueListFragment on Issue { id subIssues(first: 100) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SubIssueFragment id } } __typename }";
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
