package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sf implements aaShadow.w0 {
    public static final of Companion = new of();
    public String r;
    public aa1.b s;

    public sf(String str, aa1.b bVar) {
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.o1.a;
        List list2 = en0.o1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) obj;
        return this.r.equals(sfVar.r) && this.s.equals(sfVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.la.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "fbb0e67e6f219128240d675bf19534f25881e6c63fdc9af8096de6bc16822c8c";
    }

    public final String j() {
        Companion.getClass();
        return "query GlobalCodeSearch($query: String!, $after: String, $first: Int!) { codeSearch(query: $query, first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...GlobalCodeSearchFragment } } }  fragment GlobalCodeSearchFragment on CodeSearchResult { language { color id name } repository { id name owner { id login avatarUrl } __typename } matchCount path refName snippets { lines startingLineNumber endingLineNumber jumpToLineNumber score } }";
    }

    public final String name() {
        return "GlobalCodeSearch";
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
        fVar.z0("first");
        fVar.z(30);
    }

    public final String toString() {
        return jo.f4Shadow.l(this.s, "GlobalCodeSearchQuery(query=", this.r, ", after=", ", first=30)");
    }
}
