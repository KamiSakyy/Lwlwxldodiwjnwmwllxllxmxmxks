package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q70 implements aaShadow.n0 {
    public static final n70 Companion = new n70();
    public String r;

    public q70(String str) {
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.p5.a;
        List list2 = kz0.p5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q70) && k71.k.b(this.r, ((q70) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.iu.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "e90177ff90c16d4757e27e048663beb0fcb25f3b61b403981b3657205361b681";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UndoUserDisinterest($identifier: String!) { undoUserDisinterest(input: { identifier: $identifier } ) { clientMutationId } }";
    }

    public final String name() {
        return "UndoUserDisinterest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("identifier");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UndoUserDisinterestMutation(identifier=", this.r, ")");
    }
}
