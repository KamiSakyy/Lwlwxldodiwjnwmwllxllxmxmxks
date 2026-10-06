package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ev implements aaShadow.w0 {
    public static final xu Companion = new xu();
    public final String r;
    public final String s;
    public final aa.u0 t;

    public ev(aa.u0 u0Var, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.s3.a;
        List list2 = h10.s3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return k71.k.b(this.r, evVar.r) && k71.k.b(this.s, evVar.s) && this.t.equals(evVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.kl.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "1605b46b954ed712e758156a493028d2de6d3175f7c93701f3f597f9d8b2c045";
    }

    public final String j() {
        Companion.getClass();
        return "query ReleasesQuery($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id latestRelease { id name tagName descriptionHTML author { __typename ...actorFields id } createdAt publishedAt __typename } releases(first: $number, after: $after, orderBy: { direction: DESC field: CREATED_AT } ) { pageInfo { hasNextPage endCursor } nodes { id name tagName author { __typename ...actorFields id } isPrerelease isDraft isLatest createdAt publishedAt url __typename } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }";
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
