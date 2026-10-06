package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nv implements aaShadow.w0 {
    public static final gv Companion = new gv();
    public final String r;
    public final String s;
    public final String t;

    public nv(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "branchAndPath");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.v3.a;
        List list2 = kz0.v3.a;
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
        return k71.k.b(this.r, nvVar.r) && k71.k.b(this.s, nvVar.s) && k71.k.b(this.t, nvVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ol.a, false);
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
