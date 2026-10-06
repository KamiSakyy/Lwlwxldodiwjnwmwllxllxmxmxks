package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yc0 implements aaShadow.w0 {
    public static final sc0 Companion = new sc0();
    public aa1.b r;
    public aa1.b s;

    public yc0(aa1.b bVar, aa1.b bVar2) {
        k71.k.g(bVar, "after");
        k71.k.g(bVar2, "query");
        this.r = bVar;
        this.s = bVar2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.r6.a;
        List list2 = en0.r6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0)) {
            return false;
        }
        yc0 yc0Var = (yc0) obj;
        return k71.k.b(this.r, yc0Var.r) && k71.k.b(this.s, yc0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ix.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + f1.e.a(this.r, Integer.hashCode(30) * 31, 31);
    }

    public final String i() {
        return "24364dd619615103df2a96b114ba14e2988d66dea203144850ee4d182572d7e9";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerTemplateRepositoriesQuery($first: Int!, $after: String, $query: String) { viewer { repositories(first: $first, after: $after, query: $query, type: TEMPLATE, orderBy: { field: NAME direction: ASC } ) { pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...SimpleRepositoryFragment id } } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }";
    }

    public final String name() {
        return "ViewerTemplateRepositoriesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return "ViewerTemplateRepositoriesQuery(first=30, after=" + this.r + ", query=" + this.s + ")";
    }
}
