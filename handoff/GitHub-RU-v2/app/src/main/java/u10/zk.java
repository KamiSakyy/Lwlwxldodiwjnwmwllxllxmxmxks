package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zk implements aaShadow.w0 {
    public static final tk Companion = new tk();
    public String r;
    public int s;
    public String t;

    public zk(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "commentUrl");
        this.r = str;
        this.s = i;
        this.t = str2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.m2.a;
        List list2 = fc0.m2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return k71.k.b(this.r, zkVar.r) && this.s == zkVar.s && k71.k.b(this.t, zkVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ud.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "a41050b3a085f7f396b99e2e2413e705fc3b006e538c0cd0322cf75c1311bb1e";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationDiscussionCommentId($repositoryOwner: String!, $discussionNumber: Int!, $commentUrl: String!) { organization(login: $repositoryOwner) { organizationDiscussionsRepository { id discussion(number: $discussionNumber) { comment(url: $commentUrl) { id replyTo { id __typename } __typename } id __typename } __typename } id __typename } }";
    }

    public final String name() {
        return "OrganizationDiscussionCommentId";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("discussionNumber");
        fVar.z(this.s);
        fVar.z0("commentUrl");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.s, "OrganizationDiscussionCommentIdQuery(repositoryOwner=", this.r, ", discussionNumber=", ", commentUrl="), this.t, ")");
    }
}
