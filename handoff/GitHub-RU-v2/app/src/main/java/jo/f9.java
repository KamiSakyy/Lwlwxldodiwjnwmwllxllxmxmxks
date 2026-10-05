package jo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f9 implements aa.n0 {
    public static final c9 Companion = new c9();
    public final String r;
    public final ArrayList s;

    public f9(String str, ArrayList arrayList) {
        this.r = str;
        this.s = arrayList;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.n0.a;
        List list2 = h10.n0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return this.r.equals(f9Var.r) && this.s.equals(f9Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.c6.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "058bb72c045b61a9152e40c3b0b0fe86f272cee47bb18d3f107db2006fadb655";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateUserDisinterest($identifier: String!, $reasons: [FeedDisinterestReason!]!) { createUserDisinterest(input: { identifier: $identifier reasons: $reasons } ) { clientMutationId } }";
    }

    public final String name() {
        return "CreateUserDisinterest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("identifier");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("reasons");
        aa.c.a(n10.a.D).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "CreateUserDisinterestMutation(identifier=" + this.r + ", reasons=" + this.s + ")";
    }
}
