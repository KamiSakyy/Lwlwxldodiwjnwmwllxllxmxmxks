package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y6 implements aaShadow.n0 {
    public static final u6 Companion = new u6();
    public String r;
    public String s;
    public String t;

    public y6(String str, String str2, String str3) {
        k71.k.g(str, "repositoryId");
        k71.k.g(str2, "name");
        k71.k.g(str3, "oid");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.f0.a;
        List list2 = fc0.f0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return k71.k.b(this.r, y6Var.r) && k71.k.b(this.s, y6Var.s) && k71.k.b(this.t, y6Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.l4.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "3fed2b235a2b3e0df14cdbcaa2e68c2224666a171bc5dd20c6e6c0b112add6cb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateRef($repositoryId: ID!, $name: String!, $oid: GitObjectID!) { createRef(input: { repositoryId: $repositoryId name: $name oid: $oid } ) { ref { __typename ...RepoBranchFragment id } } }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }";
    }

    public final String name() {
        return "CreateRef";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("oid");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("CreateRefMutation(repositoryId=", this.r, ", name=", this.s, ", oid="), this.t, ")");
    }
}
