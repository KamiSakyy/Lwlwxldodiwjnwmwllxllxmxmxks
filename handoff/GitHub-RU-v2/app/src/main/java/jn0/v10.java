package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v10 implements aaShadow.w0 {
    public static final r10 Companion = new r10();
    public String r;
    public String s;
    public aa1.b t;

    public v10(aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.s4.a;
        List list2 = kz0.s4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v10)) {
            return false;
        }
        v10 v10Var = (v10) obj;
        return k71.k.b(this.r, v10Var.r) && k71.k.b(this.s, v10Var.s) && k71.k.b(this.t, v10Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.fq.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "b1642486e27105627e96defdc879843b615cc217a6093d8e4ddce0f3e82e650d";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryReadme($owner: String!, $name: String!, $branchName: String) { repository(owner: $owner, name: $name) { readme(refName: $branchName) { contentHTML path } id __typename } id __typename }";
    }

    public final String name() {
        return "RepositoryReadme";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("branchName");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(a0.s0.o("RepositoryReadmeQuery(owner=", this.r, ", name=", this.s, ", branchName="), this.t, ")");
    }
}
