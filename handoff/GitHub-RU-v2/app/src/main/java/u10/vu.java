package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vu implements aaShadow.w0 {
    public static final qu Companion = new qu();
    public String r;
    public String s;
    public String t;
    public String u;

    public vu(String str, String str2, String str3, String str4) {
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
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.t3.a;
        List list2 = fc0.t3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu)) {
            return false;
        }
        vu vuVar = (vu) obj;
        return k71.k.b(this.r, vuVar.r) && k71.k.b(this.s, vuVar.s) && k71.k.b(this.t, vuVar.t) && k71.k.b(this.u, vuVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.cl.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "b8c114b8c242ba9d924b16abf49734ed736cdf66de990e5dbc1f60177761cf96";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryGitObjectTypeName($owner: String!, $name: String!, $branchAndPath: String!, $branch: String!) { repository(owner: $owner, name: $name) { id gitObject: object(expression: $branchAndPath) { __typename ...NodeIdFragment } ref(qualifiedName: $branch) { __typename id } __typename } }  fragment NodeIdFragment on Node { id __typename }";
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
