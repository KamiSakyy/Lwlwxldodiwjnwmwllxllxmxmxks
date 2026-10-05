package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r20 implements aa.w0 {
    public static final l20 Companion = new l20();
    public final String r;
    public final String s;
    public final aa1.b t;

    public r20(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.t4.a;
        List list2 = h10.t4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r20)) {
            return false;
        }
        r20 r20Var = (r20) obj;
        return k71.k.b(this.r, r20Var.r) && k71.k.b(this.s, r20Var.s) && this.t.equals(r20Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.wq.a, false);
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
        if (u0Var instanceof aa.u0) {
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
