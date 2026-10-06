package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kx implements aaShadow.w0 {
    public static final dx Companion = new dx();
    public String r;
    public String s;
    public String t;

    public kx(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "branchAndPath");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.c4.a;
        List list2 = h10.c4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return k71.k.b(this.r, kxVar.r) && k71.k.b(this.s, kxVar.s) && k71.k.b(this.t, kxVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.wm.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "e964c6cbfa06075a3a068db25f8a15061bcaf4e6652957ceba79234461d8ca77";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoFiles($owner: String!, $name: String!, $branchAndPath: String!) { repository(owner: $owner, name: $name) { gitObject: object(expression: $branchAndPath) { __typename ...NodeIdFragment ... on Tree { entries { name type mode submodule { gitUrl } } id } } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }";
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
