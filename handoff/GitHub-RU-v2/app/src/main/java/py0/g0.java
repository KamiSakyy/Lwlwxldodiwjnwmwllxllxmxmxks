package py0;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.u0;
import java.util.List;
import jo.f4;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 implements n0 {
    public static final c0 Companion = new c0();
    public final String r;
    public final u0 s;

    public g0(u0 u0Var, String str) {
        k71.k.g(str, "repositoryId");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = uy0.f.a;
        List list2 = uy0.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.r, g0Var.r) && this.s.equals(g0Var.s);
    }

    public final p0 g() {
        return aa.c.c(qy0.p.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "d21e9a55806a8f684514b23f28591ee317c65ee3e8fe7124342d4d5cd9fb91ca";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateRepository($repositoryId: ID!, $description: String) { updateRepository(input: { repositoryId: $repositoryId description: $description } ) { repository { id description descriptionHTML shortDescriptionHTML __typename } } }";
    }

    public final String name() {
        return "UpdateRepository";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("description");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return f4.k(this.s, "UpdateRepositoryMutation(repositoryId=", this.r, ", description=", ")");
    }
}
