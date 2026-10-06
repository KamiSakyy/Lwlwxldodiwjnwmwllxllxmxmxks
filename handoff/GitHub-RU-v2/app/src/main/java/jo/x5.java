package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x5 implements aaShadow.w0 {
    public static final r5 Companion = new r5();
    public String r;
    public aa1.b s;

    public x5(String str, aa1.b bVar) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.a0.a;
        List list2 = h10.a0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return k71.k.b(this.r, x5Var.r) && k71.k.b(this.s, x5Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.q3.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "cc8c1031946db0796c94709250e1f746549c47edebd902ea1cf9982f3f9e5ce0";
    }

    public final String j() {
        Companion.getClass();
        return "query CodeSearch($query: String!, $after: String) { codeSearch(query: $query, first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { language { color name } path matchCount snippets { startingLineNumber endingLineNumber jumpToLineNumber lines score } } } id __typename }";
    }

    public final String name() {
        return "CodeSearch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f4.l(this.s, "CodeSearchQuery(query=", this.r, ", after=", ")");
    }
}
