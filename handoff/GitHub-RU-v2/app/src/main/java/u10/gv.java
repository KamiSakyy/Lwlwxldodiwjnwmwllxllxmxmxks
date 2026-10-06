package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gv implements aaShadow.w0 {
    public static final av Companion = new av();
    public String r;
    public String s;
    public aa1.b t;
    public aa.u0 u;

    public gv(aa.u0 u0Var, aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.v3.a;
        List list2 = fc0.v3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return k71.k.b(this.r, gvVar.r) && k71.k.b(this.s, gvVar.s) && this.t.equals(gvVar.t) && this.u.equals(gvVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.il.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "8c7cd3a9c491b76ceed9a4680c4aee6ea719d96c02dc9206b4e3c561fed71e02";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryLabels($owner: String!, $repo: String!, $query: String, $after: String) { repository(owner: $owner, name: $repo) { id labels(first: 50, orderBy: { field: NAME direction: ASC } , query: $query, after: $after) { pageInfo { hasNextPage endCursor } nodes { id color name description __typename } } __typename } }";
    }

    public final String name() {
        return "RepositoryLabels";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryLabelsQuery(owner=", this.r, ", repo=", this.s, ", query=");
        o.append(this.t);
        o.append(", after=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
