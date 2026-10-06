package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hw implements aaShadow.w0 {
    public static final ew Companion = new ew();
    public final String r;
    public final String s;
    public final aa1.b t;
    public final aa1.b u;

    public hw(aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = bVar2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.a4.a;
        List list2 = fc0.a4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        return k71.k.b(this.r, hwVar.r) && k71.k.b(this.s, hwVar.s) && k71.k.b(this.t, hwVar.t) && k71.k.b(this.u, hwVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.cm.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "37c5bedb660cd69e2925f82d2e8d304c5a4a2894e5a90f41455bae7964efa56a";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryProjects($owner: String!, $repo: String!, $search: String, $after: String) { repository(owner: $owner, name: $repo) { __typename ...projectOwnerFragment id } }  fragment ProjectFragment on Project { id name state number __typename }  fragment projectOwnerFragment on ProjectOwner { id projects(first: 50, states: [OPEN], search: $search, orderBy: { direction: ASC field: NAME } , after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...ProjectFragment id } } }";
    }

    public final String name() {
        return "RepositoryProjects";
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
            fVar.z0("search");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return f1.e.l(a0.s0.o("RepositoryProjectsQuery(owner=", this.r, ", repo=", this.s, ", search="), this.t, ", after=", this.u, ")");
    }
}
