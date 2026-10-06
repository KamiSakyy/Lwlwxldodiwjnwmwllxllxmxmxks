package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r00 implements aaShadow.w0 {
    public static final l00 Companion = new l00();
    public String r;
    public String s;
    public aa1.b t;

    public r00(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.m4.a;
        List list2 = kz0.m4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return k71.k.b(this.r, r00Var.r) && k71.k.b(this.s, r00Var.s) && this.t.equals(r00Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.lp.a, false);
    }

    public final int hashCode() {
        return ((this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31)) * 31) + 108391919;
    }

    public final String i() {
        return "d55f536566d952e78ca00a989772dddc9ffd4133c2e1981f72f139ed40b21253";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryLastBranches($owner: String!, $repo: String!, $query: String, $refPrefix: String!) { repository(owner: $owner, name: $repo) { defaultBranchRef { name id __typename } refs(last: 50, refPrefix: $refPrefix, query: $query) { nodes { __typename ...RepoBranchFragment id } } id __typename } id __typename }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }";
    }

    public final String name() {
        return "RepositoryLastBranches";
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
        fVar.z0("refPrefix");
        bVar.b(fVar, wVar, "refs/");
    }

    public final String toString() {
        return f1.e.k(a0.s0.o("RepositoryLastBranchesQuery(owner=", this.r, ", repo=", this.s, ", query="), this.t, ", refPrefix=refs/)");
    }
}
