package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 implements aa.n0 {
    public static final m4 Companion = new m4();
    public final String r;
    public final String s;
    public final String t;
    public final gn0.tr u;
    public final aa1.b v;
    public final boolean w;

    public p4(String str, String str2, String str3, gn0.tr trVar, aa1.b bVar, boolean z) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str3, "ownerId");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = trVar;
        this.v = bVar;
        this.w = z;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.v.a;
        List list2 = en0.v.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.r, p4Var.r) && k71.k.b(this.s, p4Var.s) && k71.k.b(this.t, p4Var.t) && this.u == p4Var.u && k71.k.b(this.v, p4Var.v) && this.w == p4Var.w;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.w2.a, false);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + f1.e.a(this.v, (this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31)) * 31, 31);
    }

    public final String i() {
        return "8e80f253d5533cc4bee34103a3b4de3ea456b4c7dc350940512df6c1d8111dbd";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CloneTemplateRepository($repositoryId: ID!, $name: String!, $ownerId: ID!, $visibility: RepositoryVisibility!, $description: String, $includeAllBranches: Boolean!) { cloneTemplateRepository(input: { repositoryId: $repositoryId name: $name ownerId: $ownerId visibility: $visibility description: $description includeAllBranches: $includeAllBranches } ) { repository { id url __typename } } }";
    }

    public final String name() {
        return "CloneTemplateRepository";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("ownerId");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("visibility");
        fVar.I(this.u.r);
        aa.u0 u0Var = this.v;
        if (u0Var instanceof aa.u0) {
            fVar.z0("description");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("includeAllBranches");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(this.w));
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CloneTemplateRepositoryMutation(repositoryId=", this.r, ", name=", this.s, ", ownerId=");
        o.append(this.t);
        o.append(", visibility=");
        o.append(this.u);
        o.append(", description=");
        o.append(this.v);
        o.append(", includeAllBranches=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
