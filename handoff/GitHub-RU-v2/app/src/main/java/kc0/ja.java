package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ja implements aaShadow.w0 {
    public static final eaShadow Companion = new eaShadow();
    public String r;
    public String s;
    public int t;
    public String u;

    public ja(int i, String str, String str2, String str3) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "commentUrl");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.s0.a;
        List list2 = en0.s0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return k71.k.b(this.r, jaVar.r) && k71.k.b(this.s, jaVar.s) && this.t == jaVar.t && k71.k.b(this.u, jaVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.u6.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "b9db11f2e442a94907c98d772e8d3de9cfe44949a2cda7f360b0ae1198caafcf";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionCommentId($repositoryOwner: String!, $repositoryName: String!, $discussionNumber: Int!, $commentUrl: String!) { repository(owner: $repositoryOwner, name: $repositoryName) { id discussion(number: $discussionNumber) { id comment(url: $commentUrl) { id replyTo { id __typename } __typename } __typename } __typename } }";
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
