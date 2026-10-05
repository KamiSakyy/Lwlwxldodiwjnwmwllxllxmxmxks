package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aq implements aa.w0 {
    public static final tp Companion = new tp();
    public final String r;
    public final String s;
    public final aa.u0 t;

    public aq(aa.u0 u0Var, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.a3.a;
        List list2 = fc0.a3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return k71.k.b(this.r, aqVar.r) && k71.k.b(this.s, aqVar.s) && this.t.equals(aqVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.sh.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "8b2c063076032d030da91d0a718cd5e91aab46d08f24d270700f1c16d7640525";
    }

    public final String j() {
        Companion.getClass();
        return "query ReleasesQuery($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id latestRelease { id name tagName descriptionHTML author { __typename ...actorFields id } createdAt publishedAt __typename } releases(first: $number, after: $after, orderBy: { direction: DESC field: CREATED_AT } ) { pageInfo { hasNextPage endCursor } nodes { id name tagName author { __typename ...actorFields id } isPrerelease isDraft isLatest createdAt publishedAt url __typename } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }";
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
