package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 implements aa.w0 {
    public static final b5 Companion = new b5();
    public final String r;
    public final aa1.b s;

    public h5(String str, aa1.b bVar) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.y.a;
        List list2 = en0.y.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return k71.k.b(this.r, h5Var.r) && k71.k.b(this.s, h5Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.f3.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "ca3a8e306e2206985987dba7602ef0f19eacd7e867340b340967729163ef0ef6";
    }

    public final String j() {
        Companion.getClass();
        return "query CodeSearch($query: String!, $after: String) { codeSearch(query: $query, first: 25, after: $after) { pageInfo { hasNextPage endCursor } nodes { language { color name } path matchCount snippets { startingLineNumber endingLineNumber jumpToLineNumber lines score } } } }";
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
