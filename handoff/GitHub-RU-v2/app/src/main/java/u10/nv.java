package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nv implements aaShadow.w0 {
    public static final hv Companion = new hv();
    public String r;
    public String s;
    public aa1.b t;

    public nv(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.w3.a;
        List list2 = fc0.w3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        nv nvVar = (nv) obj;
        return k71.k.b(this.r, nvVar.r) && k71.k.b(this.s, nvVar.s) && this.t.equals(nvVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.nl.a, false);
    }

    public final int hashCode() {
        return ((this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31)) * 31) + 108391919;
    }

    public final String i() {
        return "35202e6358263d1332f3583dad1dc481e9fccb3541edcdb501273e4a06bd5ab3";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryLastBranches($owner: String!, $repo: String!, $query: String, $refPrefix: String!) { repository(owner: $owner, name: $repo) { defaultBranchRef { name id __typename } refs(last: 50, refPrefix: $refPrefix, query: $query) { nodes { __typename ...RepoBranchFragment id } } id __typename } }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }";
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
