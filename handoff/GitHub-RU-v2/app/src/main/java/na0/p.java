package na0;

import hc0.wg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.n0 {
    public static final l Companion = new l();
    public String r;
    public ArrayList s;

    public p(String str, ArrayList arrayList) {
        k71.k.g(str, "baseIssueOrPullRequestId");
        this.r = str;
        this.s = arrayList;
    }

    public final aa.m d() {
        wg.Companion.getClass();
        aa.q0 q0Var = wg.c1;
        k71.k.g(q0Var, "type");
        List list = pa0.c.a;
        List list2 = pa0.c.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.r, pVar.r) && this.s.equals(pVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(oa0.h.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "1fd7678c7bd62acf65313e31752988747d3478cd657029d4673c54f652b23406";
    }

    public final String j() {
        Companion.getClass();
        return "mutation LinkIssueOrPullRequestMutation($baseIssueOrPullRequestId: ID!, $linkedIssuesOrPRs: [ID!]!) { linkIssueOrPullRequest(input: { baseIssueOrPullRequestId: $baseIssueOrPullRequestId linkingIds: $linkedIssuesOrPRs } ) { linkedIssuesOrPullRequests { __typename ...LinkedIssueFragment ...LinkedPullRequestFragment } } }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } __typename }";
    }

    public final String name() {
        return "LinkIssueOrPullRequestMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("baseIssueOrPullRequestId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("linkedIssuesOrPRs");
        aa.c.a(bVar).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "LinkIssueOrPullRequestMutation(baseIssueOrPullRequestId=" + this.r + ", linkedIssuesOrPRs=" + this.s + ")";
    }
}
