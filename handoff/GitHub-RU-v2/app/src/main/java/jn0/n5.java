package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n5 implements aa.w0 {
    public static final h5 Companion = new h5();
    public final String r;
    public final aa1.b s;

    public n5(String str, aa1.b bVar) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.z.a;
        List list2 = kz0.z.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return k71.k.b(this.r, n5Var.r) && k71.k.b(this.s, n5Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.j3.a, false);
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
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return jo.f4.l(this.s, "CodeSearchQuery(query=", this.r, ", after=", ")");
    }
}
