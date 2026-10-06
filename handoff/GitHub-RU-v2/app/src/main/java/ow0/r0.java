package ow0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aa.w0 {
    public static final n0 Companion = new n0();
    public final String r;

    public r0(String str) {
        k71.k.g(str, "issueId");
        this.r = str;
    }

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = qw0.f.a;
        List list2 = qw0.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && k71.k.b(this.r, ((r0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(pw0.d0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5ca6e0120bb6db9089ca5fd98909531cdefa00940f7f4df1d75ec2cd62e6194e";
    }

    public final String j() {
        Companion.getClass();
        return "query SubIssueData($issueId: ID!) { node(id: $issueId) { __typename ... on Issue { __typename ...SubIssuesFragment } id } id __typename }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state __typename } id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueFragment on Issue { __typename id ...SubIssueProgressFragment titleHTML number issueState: state assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } repository { id name owner { id login } __typename } parent { id __typename } }  fragment SubIssueListFragment on Issue { id subIssues(first: 100) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SubIssueFragment id } } __typename }  fragment SubIssuesFragment on Issue { __typename id ...SubIssueProgressFragment ...ParentIssueFragment ...SubIssueListFragment }";
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
