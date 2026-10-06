package jn0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class me0 implements aaShadow.n0 {
    public static final ie0 Companion = new ie0();
    public aa.u0 r;
    public ArrayList s;

    public me0(aa.u0 u0Var, ArrayList arrayList) {
        this.r = u0Var;
        this.s = arrayList;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.t6.a;
        List list2 = kz0.t6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        return this.r.equals(me0Var.r) && this.s.equals(me0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.wy.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "914756bd6339bffa62d4dd329ae696013d7eaff13c7b0d08eddc01d3ef63ae9b";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateUserDashboardNavLinks($hiddenLinks: [UserDashboardNavLinkIdentifier!], $sortedLinks: [UserDashboardNavLinkIdentifier!]!) { updateUserDashboardNavLinks(input: { hiddenLinks: $hiddenLinks sortedLinks: $sortedLinks } ) { navLinks { identifier hidden } } }";
    }

    public final String name() {
        return "UpdateUserDashboardNavLinks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        qz0.b bVar = qz0.b.A;
        fVar.z0("hiddenLinks");
        aa.c.d(aa.c.b(aa.c.a(bVar))).d(fVar, wVar, this.r);
        fVar.z0("sortedLinks");
        aa.c.a(bVar).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "UpdateUserDashboardNavLinksMutation(hiddenLinks=" + this.r + ", sortedLinks=" + this.s + ")";
    }
}
