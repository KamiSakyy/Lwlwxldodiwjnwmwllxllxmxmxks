package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tf implements aaShadow.w0 {
    public static final nf Companion = new nf();
    public String r;
    public String s;
    public String t;
    public String u;

    public tf(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str4, "filePath");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.o1.a;
        List list2 = kz0.o1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return k71.k.b(this.r, tfVar.r) && k71.k.b(this.s, tfVar.s) && k71.k.b(this.t, tfVar.t) && k71.k.b(this.u, tfVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ka.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "8cef64db47de130ad5f38d72721b825092ec054b29bb6c9544ddf2e76edfbda3";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchRepositoryFileExists($owner: String!, $name: String!, $branchQualifiedName: String!, $filePath: String!) { repository(owner: $owner, name: $name) { id object(expression: $branchQualifiedName) { __typename id ... on Commit { id file(path: $filePath) { name } } } __typename } id __typename }";
    }

    public final String name() {
        return "FetchRepositoryFileExists";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("branchQualifiedName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("filePath");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("FetchRepositoryFileExistsQuery(owner=", this.r, ", name=", this.s, ", branchQualifiedName="), this.t, ", filePath=", this.u, ")");
    }
}
