package ow0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.w0 {
    public static final a Companion = new a();
    public String r;

    public f(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = qw0.a.a;
        List list2 = qw0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.r, ((f) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(pw0.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "d46873ab5dde1257289f9575854e524d3af5f1034da9306b6626d2e6d1e63fcc";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchLinkedIssueOrPullRequests($id: ID!) { node(id: $id) { __typename ... on Issue { __typename id ...LinkedPullRequests } ... on PullRequest { __typename id ...LinkedIssues } id } id __typename }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment LinkedPullRequests on Issue { userLinkedOnlyClosedByPullRequestReferences: closedByPullRequestsReferences(userLinkedOnly: true, includeClosedPrs: true, first: 10) { totalCount nodes { id __typename } } allClosedByPullRequestReferences: closedByPullRequestsReferences(userLinkedOnly: false, includeClosedPrs: true, first: 10) { totalCount nodes { __typename ...LinkedPullRequestFragment id } } id __typename }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedIssues on PullRequest { id userLinkedOnlyClosingIssueReferences: closingIssuesReferences(userLinkedOnly: true, first: 10) { nodes { id __typename } } allClosingIssueReferences: closingIssuesReferences(userLinkedOnly: false, first: 10) { nodes { __typename ...LinkedIssueFragment id } } __typename }";
    }

    public final String name() {
        return "FetchLinkedIssueOrPullRequests";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FetchLinkedIssueOrPullRequestsQuery(id=", this.r, ")");
    }
}
