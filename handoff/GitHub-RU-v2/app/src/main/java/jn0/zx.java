package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zx implements aaShadow.w0 {
    public static final sx Companion = new sx();
    public final String r;
    public final String s;
    public final aa.u0 t;
    public final aa1.b u;
    public final aa1.b v;

    public zx(String str, String str2, aa.u0 u0Var, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
        this.u = bVar;
        this.v = bVar2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.d4.a;
        List list2 = kz0.d4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx)) {
            return false;
        }
        zx zxVar = (zx) obj;
        return k71.k.b(this.r, zxVar.r) && k71.k.b(this.s, zxVar.s) && this.t.equals(zxVar.t) && this.u.equals(zxVar.u) && this.v.equals(zxVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.kn.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, jo.f4.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "49d545cf5be9529d083c891f58a0fb624a0559586a7b3d24ef50f13ea3dcf11f";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryBranches($owner: String!, $repo: String!, $after: String, $query: String, $refPrefix: String = \"refs/heads/\" ) { repository(owner: $owner, name: $repo) { defaultBranchRef { name id __typename } refs(first: 50, after: $after, refPrefix: $refPrefix, query: $query) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepoBranchFragment id } } id __typename } id __typename }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }";
    }

    public final String name() {
        return "RepositoryBranches";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("after");
        aa.o0 o0Var = aa.c.i;
        aa.c.d(o0Var).d(fVar, wVar, this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(o0Var).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.v;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("refPrefix");
            aa.c.d(o0Var).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("refPrefix");
            aa.c.l.b(fVar, wVar, "refs/heads/");
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryBranchesQuery(owner=", this.r, ", repo=", this.s, ", after=");
        o.append(this.t);
        o.append(", query=");
        o.append(this.u);
        o.append(", refPrefix=");
        return f1.e.k(o, this.v, ")");
    }
}
