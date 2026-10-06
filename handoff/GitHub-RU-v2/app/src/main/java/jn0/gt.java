package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gt implements aaShadow.w0 {
    public static final zs Companion = new zs();
    public String r;
    public String s;
    public aa.u0 t;

    public gt(aa.u0 u0Var, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.l3.a;
        List list2 = kz0.l3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        return k71.k.b(this.r, gtVar.r) && k71.k.b(this.s, gtVar.s) && this.t.equals(gtVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ck.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "9963f07d7916ae6884080d3b20f8737673238f90ee4bfb49d97ef3bd27124c81";
    }

    public final String j() {
        Companion.getClass();
        return "query ReleasesQuery($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id latestRelease { id name tagName descriptionHTML author { __typename ...actorFields id } createdAt publishedAt __typename } releases(first: $number, after: $after, orderBy: { direction: DESC field: CREATED_AT } ) { pageInfo { hasNextPage endCursor } nodes { id name tagName author { __typename ...actorFields id } isPrerelease isDraft isLatest createdAt publishedAt url __typename } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }";
    }

    public final String name() {
        return "ReleasesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(a0.s0.o("ReleasesQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number=30, after="), this.t, ")");
    }
}
