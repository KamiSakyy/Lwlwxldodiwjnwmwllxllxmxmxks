package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sa implements aaShadow.w0 {
    public static final ma Companion = new ma();
    public String r;
    public String s;
    public boolean t;
    public aa.u0 u;

    public sa(String str, String str2, boolean z, aa.u0 u0Var) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = z;
        this.u = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.t0.a;
        List list2 = kz0.t0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return k71.k.b(this.r, saVar.r) && k71.k.b(this.s, saVar.s) && this.t == saVar.t && this.u.equals(saVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.a7.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(30, x.i.e(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31, this.t), 31);
    }

    public final String i() {
        return "20a14b6c04de6d5d009cf085b8a0a14c4463e63cbb49a07feb8083845191cccb";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionCategoriesQuery($repositoryOwner: String!, $repositoryName: String!, $filterByAssignable: Boolean!, $number: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id discussionCategories(first: $number, after: $after, filterByAssignable: $filterByAssignable) { pageInfo { hasNextPage endCursor } nodes { __typename ...DiscussionCategoryFragment id } } __typename } id __typename }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }";
    }

    public final String name() {
        return "DiscussionCategoriesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("filterByAssignable");
        jo.f4.C(this.t, aa.c.f, fVar, wVar, "number");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionCategoriesQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", filterByAssignable=");
        o.append(this.t);
        o.append(", number=30, after=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
