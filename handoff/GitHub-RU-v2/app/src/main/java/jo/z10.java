package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z10 implements aaShadow.w0 {
    public static final u10 Companion = new u10();
    public String r;
    public String s;
    public String t;
    public String u;

    public z10(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "branchAndPath");
        k71.k.g(str4, "branch");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.q4.a;
        List list2 = h10.q4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z10)) {
            return false;
        }
        z10 z10Var = (z10) obj;
        return k71.k.b(this.r, z10Var.r) && k71.k.b(this.s, z10Var.s) && k71.k.b(this.t, z10Var.t) && k71.k.b(this.u, z10Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.lq.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "b52fd4cfe1498c7372eee860e4f2888e5d3ba66923c771ee3ba276b4d453b255";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryGitObjectTypeName($owner: String!, $name: String!, $branchAndPath: String!, $branch: String!) { repository(owner: $owner, name: $name) { id gitObject: object(expression: $branchAndPath) { __typename ...NodeIdFragment } ref(qualifiedName: $branch) { __typename id } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "RepositoryGitObjectTypeName";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("branchAndPath");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("branch");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("RepositoryGitObjectTypeNameQuery(owner=", this.r, ", name=", this.s, ", branchAndPath="), this.t, ", branch=", this.u, ")");
    }
}
