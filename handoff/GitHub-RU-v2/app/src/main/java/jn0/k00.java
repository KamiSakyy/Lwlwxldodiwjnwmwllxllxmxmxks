package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k00 implements aaShadow.w0 {
    public static final e00 Companion = new e00();
    public String r;
    public String s;
    public aa1.b t;
    public aa.u0 u;

    public k00(aa.u0 u0Var, aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.l4.a;
        List list2 = kz0.l4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return k71.k.b(this.r, k00Var.r) && k71.k.b(this.s, k00Var.s) && this.t.equals(k00Var.t) && this.u.equals(k00Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.gp.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "33c0747542a0737b387de48422391991a9c6cb9641c9e6a07f0d1d44c534894e";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryLabels($owner: String!, $repo: String!, $query: String, $after: String) { repository(owner: $owner, name: $repo) { id labels(first: 50, orderBy: { field: NAME direction: ASC } , query: $query, after: $after) { pageInfo { hasNextPage endCursor } nodes { id color name description __typename } } __typename } id __typename }";
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
