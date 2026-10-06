package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tb implements aaShadow.w0 {
    public static final qb Companion = new qb();
    public String r;
    public String s;
    public String t;

    public tb(String str, String str2, String str3) {
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.x0.a;
        List list2 = h10.x0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        return k71.k.b(this.r, tbVar.r) && k71.k.b(this.s, tbVar.s) && k71.k.b(this.t, tbVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.v7.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "062a144c9422c9bc7306a6e81c4b95eecb9f67bd16f17f6ece9d45f84015c2ae";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionCategoryQuery($repositoryOwner: String!, $repositoryName: String!, $slug: String!) { discussionCategory(owner: $repositoryOwner, repo: $repositoryName, slug: $slug) { __typename ...DiscussionCategoryFragment id } id __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }";
    }

    public final String name() {
        return "DiscussionCategoryQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("slug");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("DiscussionCategoryQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", slug="), this.t, ")");
    }
}
