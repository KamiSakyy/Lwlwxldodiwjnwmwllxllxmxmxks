package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class id implements aa.w0 {
    public static final cd Companion = new cd();
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public id(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str4, "filePath");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.f1.a;
        List list2 = fc0.f1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id)) {
            return false;
        }
        id idVar = (id) obj;
        return k71.k.b(this.r, idVar.r) && k71.k.b(this.s, idVar.s) && k71.k.b(this.t, idVar.t) && k71.k.b(this.u, idVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.s8.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "9cc176d364a2dde8e688777111c86233a00d85de2a5d814e16ea2a4238dd572e";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchRepositoryFileExists($owner: String!, $name: String!, $branchQualifiedName: String!, $filePath: String!) { repository(owner: $owner, name: $name) { id object(expression: $branchQualifiedName) { __typename id ... on Commit { id file(path: $filePath) { name } } } __typename } }";
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
