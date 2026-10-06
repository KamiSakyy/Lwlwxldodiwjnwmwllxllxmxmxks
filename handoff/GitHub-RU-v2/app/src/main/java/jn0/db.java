package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class db implements aaShadow.w0 {
    public static final ya Companion = new ya();
    public String r;
    public String s;
    public int t;
    public String u;

    public db(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "commentUrl");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.v0.a;
        List list2 = kz0.v0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return k71.k.b(this.r, dbVar.r) && k71.k.b(this.s, dbVar.s) && this.t == dbVar.t && k71.k.b(this.u, dbVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.i7.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "710af926d6a9f7aa551a71a04c01e70af353ed09a6632571d4cbb6381bb1f3cb";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionCommentId($repositoryOwner: String!, $repositoryName: String!, $discussionNumber: Int!, $commentUrl: String!) { repository(owner: $repositoryOwner, name: $repositoryName) { id discussion(number: $discussionNumber) { id comment(url: $commentUrl) { id replyTo { id __typename } __typename } __typename } __typename } id __typename }";
    }

    public final String name() {
        return "DiscussionCommentId";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("discussionNumber");
        fVar.z(this.t);
        fVar.z0("commentUrl");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return com.github.rudroid.m0.c(this.t, ", commentUrl=", this.u, ")", a0.s0.o("DiscussionCommentIdQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", discussionNumber="));
    }
}
