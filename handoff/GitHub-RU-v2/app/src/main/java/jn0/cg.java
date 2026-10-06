package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cg implements aaShadow.w0 {
    public static final uf Companion = new uf();
    public String r;
    public String s;
    public String t;
    public String u;
    public aa.u0 v;

    public cg(aa.u0 u0Var, String str, String str2, String str3, String str4) {
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
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.p1.a;
        List list2 = kz0.p1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return k71.k.b(this.r, cgVar.r) && k71.k.b(this.s, cgVar.s) && k71.k.b(this.t, cgVar.t) && k71.k.b(this.u, cgVar.u) && this.v.equals(cgVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.pa.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31);
    }

    public final String i() {
        return "3aa5a2b1354d25513f547f7d9047a04c789bd383612a94dbcc4e9a3f11c11caa";
    }

    public final String j() {
        Companion.getClass();
        return "query FileHistory($owner: String!, $name: String!, $branch: String!, $path: String!, $after: String = null ) { repository(owner: $owner, name: $name) { id gitObject: object(expression: $branch) { __typename ...NodeIdFragment ... on Commit { id history(path: $path, first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...commitFields id } } } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment commitFields on Commit { id committedDate messageHeadline committedViaWeb authoredByCommitter abbreviatedOid committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { __typename login id } } statusCheckRollup { id state __typename } __typename }";
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
