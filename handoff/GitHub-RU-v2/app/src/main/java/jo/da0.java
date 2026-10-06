package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class da0 implements aaShadow.n0 {
    public static final aa0 Companion = new aa0();
    public String r;

    public da0(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.y5.a;
        List list2 = h10.y5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da0) && k71.k.b(this.r, ((da0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.cw.a, false);
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
