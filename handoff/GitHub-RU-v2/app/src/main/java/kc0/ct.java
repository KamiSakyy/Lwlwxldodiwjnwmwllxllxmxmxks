package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ct implements aaShadow.w0 {
    public static final vs Companion = new vs();
    public String r;
    public String s;
    public String t;

    public ct(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "branchAndPath");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.n3.a;
        List list2 = en0.n3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return k71.k.b(this.r, ctVar.r) && k71.k.b(this.s, ctVar.s) && k71.k.b(this.t, ctVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.uj.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "8d5eac34fa86ae42046d3825996a80835904ca9225dd44a4517d30980a6da329";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoFiles($owner: String!, $name: String!, $branchAndPath: String!) { repository(owner: $owner, name: $name) { gitObject: object(expression: $branchAndPath) { __typename ...NodeIdFragment ... on Tree { entries { name type mode submodule { gitUrl } } id } } id __typename } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "RepoFiles";
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
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("RepoFilesQuery(owner=", this.r, ", name=", this.s, ", branchAndPath="), this.t, ")");
    }
}
