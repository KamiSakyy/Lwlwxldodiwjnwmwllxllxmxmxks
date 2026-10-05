package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class un implements aa.w0 {
    public static final on Companion = new on();
    public final String r;
    public final int s;
    public final String t;

    public un(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "commentUrl");
        this.r = str;
        this.s = i;
        this.t = str2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.w2.a;
        List list2 = kz0.w2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        return k71.k.b(this.r, unVar.r) && this.s == unVar.s && k71.k.b(this.t, unVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.wf.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "9cc700b24cb134ed989319b4be6113bc51812db33a4b326cc82b663626033e19";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationDiscussionCommentId($repositoryOwner: String!, $discussionNumber: Int!, $commentUrl: String!) { organization(login: $repositoryOwner) { organizationDiscussionsRepository { id discussion(number: $discussionNumber) { comment(url: $commentUrl) { id replyTo { id __typename } __typename } id __typename } __typename } id __typename } id __typename }";
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
