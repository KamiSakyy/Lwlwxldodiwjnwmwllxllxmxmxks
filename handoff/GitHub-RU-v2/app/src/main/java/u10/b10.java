package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b10 implements aaShadow.w0 {
    public static final o00 Companion = new o00();
    public String r;
    public String s;
    public int t;
    public String u;

    public b10(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "url");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.s4.a;
        List list2 = fc0.s4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return k71.k.b(this.r, b10Var.r) && k71.k.b(this.s, b10Var.s) && this.t == b10Var.t && k71.k.b(this.u, b10Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.cp.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "2428d4e73aa73bf98d748d710cf720b30acae7b1e38065df166332358a49832a";
    }

    public final String j() {
        Companion.getClass();
        return "query TimeLineItemId($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $url: String!) { repository(owner: $repositoryOwner, name: $repositoryName) { id issueOrPullRequest(number: $number) { __typename ... on Issue { timelineItem(url: $url) { __typename ... on Node { id } } id } ... on PullRequest { id timelineItem(url: $url) { __typename ... on Node { id } ... on PullRequestReviewThread { id comments(first: 1) { nodes { pullRequestReview { id __typename } id __typename } } } } } } __typename } }";
    }

    public final String name() {
        return "TimeLineItemId";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(this.t);
        fVar.z0("url");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return com.github.rudroid.m0.c(this.t, ", url=", this.u, ")", a0.s0.o("TimeLineItemIdQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number="));
    }
}
