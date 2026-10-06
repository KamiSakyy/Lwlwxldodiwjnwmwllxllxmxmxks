package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 implements aaShadow.w0 {
    public static final v3 Companion = new v3();
    public aa1.b r;

    public b4(aa1.b bVar) {
        k71.k.g(bVar, "after");
        this.r = bVar;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.u.a;
        List list2 = h10.u.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4) && k71.k.b(this.r, ((b4) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.h2.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ea29e3ae0ff95b916e08f1627f356fefb3956e1529c5dd3278e869b3874f1c48";
    }

    public final String j() {
        Companion.getClass();
        return "query CannedReplies($after: String) { viewer { id savedReplies(first: 30, after: $after) { pageInfo { hasNextPage hasPreviousPage endCursor } nodes { id title body __typename } } __typename } id __typename }";
    }

    public final String name() {
        return "CannedReplies";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return "CannedRepliesQuery(after=" + this.r + ")";
    }
}
