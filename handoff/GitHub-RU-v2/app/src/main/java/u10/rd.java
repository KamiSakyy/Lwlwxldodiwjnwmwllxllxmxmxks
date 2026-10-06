package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rd implements aaShadow.w0 {
    public static final jd Companion = new jd();
    public String r;
    public String s;
    public String t;
    public String u;
    public aa.u0 v;

    public rd(aa.u0 u0Var, String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "branch");
        k71.k.g(str4, "path");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.g1.a;
        List list2 = fc0.g1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return k71.k.b(this.r, rdVar.r) && k71.k.b(this.s, rdVar.s) && k71.k.b(this.t, rdVar.t) && k71.k.b(this.u, rdVar.u) && this.v.equals(rdVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.x8.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31);
    }

    public final String i() {
        return "e7f9a3d117c8f5c24eb04ba32c11d78cf923182cd759c9c89220189f50af350c";
    }

    public final String j() {
        Companion.getClass();
        return "query FileHistory($owner: String!, $name: String!, $branch: String!, $path: String!, $after: String = null ) { repository(owner: $owner, name: $name) { id gitObject: object(expression: $branch) { __typename ...NodeIdFragment ... on Commit { id history(path: $path, first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...commitFields id } } } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment commitFields on Commit { id committedDate messageHeadline committedViaWeb authoredByCommitter abbreviatedOid committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { __typename login id } } statusCheckRollup { id state __typename } __typename }";
    }

    public final String name() {
        return "FileHistory";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("branch");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.v);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FileHistoryQuery(owner=", this.r, ", name=", this.s, ", branch=");
        f1.e.x(o, this.t, ", path=", this.u, ", after=");
        return f1.e.j(o, this.v, ")");
    }
}
