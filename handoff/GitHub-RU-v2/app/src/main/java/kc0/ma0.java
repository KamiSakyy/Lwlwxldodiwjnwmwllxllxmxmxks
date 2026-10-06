package kc0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ma0 implements aaShadow.n0 {
    public static final ia0 Companion = new ia0();
    public final aa.u0 r;
    public final ArrayList s;

    public ma0(aa.u0 u0Var, ArrayList arrayList) {
        this.r = u0Var;
        this.s = arrayList;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.f6.a;
        List list2 = en0.f6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma0)) {
            return false;
        }
        ma0 ma0Var = (ma0) obj;
        return this.r.equals(ma0Var.r) && this.s.equals(ma0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.xv.a, false);
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
        hn0.b bVar = hn0.b.t;
        fVar.z0("hiddenLinks");
        aa.c.d(aa.c.b(aa.c.a(bVar))).d(fVar, wVar, this.r);
        fVar.z0("sortedLinks");
        aa.c.a(bVar).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "UpdateUserDashboardNavLinksMutation(hiddenLinks=" + this.r + ", sortedLinks=" + this.s + ")";
    }
}
