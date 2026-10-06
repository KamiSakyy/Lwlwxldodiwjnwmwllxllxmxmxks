package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o8 implements aaShadow.n0 {
    public static final l8 Companion = new l8();
    public String r;

    public o8(String str) {
        k71.k.g(str, "refId");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.m0.a;
        List list2 = en0.m0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8) && k71.k.b(this.r, ((o8) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.n5.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "44c9d5cd537766f411359a0e2c1d895ff0ceb44ccf145fe1196309de9ed976f3";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteRef($refId: ID!) { deleteRef(input: { refId: $refId } ) { clientMutationId } }";
    }

    public final String name() {
        return "DeleteRef";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("refId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DeleteRefMutation(refId=", this.r, ")");
    }
}
