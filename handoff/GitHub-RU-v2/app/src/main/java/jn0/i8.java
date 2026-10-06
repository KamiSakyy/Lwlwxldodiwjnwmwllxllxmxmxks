package jn0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i8 implements aaShadow.n0 {
    public static final f8 Companion = new f8();
    public String r;
    public ArrayList s;

    public i8(String str, ArrayList arrayList) {
        this.r = str;
        this.s = arrayList;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.k0.a;
        List list2 = kz0.k0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.r.equals(i8Var.r) && this.s.equals(i8Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.m5.a, false);
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
        aa.c.a(qz0.a.s).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "CreateUserDisinterestMutation(identifier=" + this.r + ", reasons=" + this.s + ")";
    }
}
