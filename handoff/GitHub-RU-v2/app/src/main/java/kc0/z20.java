package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z20 implements aaShadow.w0 {
    public static final m20 Companion = new m20();
    public String r;
    public String s;
    public int t;
    public String u;

    public z20(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "url");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.z4.a;
        List list2 = en0.z4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj;
        return k71.k.b(this.r, z20Var.r) && k71.k.b(this.s, z20Var.s) && this.t == z20Var.t && k71.k.b(this.u, z20Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.mq.a, false);
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
