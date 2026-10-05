package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gi implements aa.w0 {
    public static final ci Companion = new ci();
    public final String r;
    public final aa1.b s;

    public gi(String str, aa1.b bVar) {
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.x1.a;
        List list2 = h10.x1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        return this.r.equals(giVar.r) && this.s.equals(giVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.gc.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "15e409e4225ad1758f245e6d9a4710b03f280ee1d7c90312c9483ab2f2664d61";
    }

    public final String j() {
        Companion.getClass();
        return "query GlobalCodeSearch($query: String!, $after: String, $first: Int!) { codeSearch(query: $query, first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...GlobalCodeSearchFragment } } id __typename }  fragment GlobalCodeSearchFragment on CodeSearchResult { language { color id name } repository { id name owner { id login avatarUrl } __typename } matchCount path refName snippets { lines startingLineNumber endingLineNumber jumpToLineNumber score } }";
    }

    public final String name() {
        return "GlobalCodeSearch";
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
        fVar.z0("first");
        fVar.z(30);
    }

    public final String toString() {
        return f4.l(this.s, "GlobalCodeSearchQuery(query=", this.r, ", after=", ", first=30)");
    }
}
