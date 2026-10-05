package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yg0 implements aa.w0 {
    public static final sg0 Companion = new sg0();
    public final aa1.b r;
    public final aa1.b s;

    public yg0(aa1.b bVar, aa1.b bVar2) {
        k71.k.g(bVar, "after");
        k71.k.g(bVar2, "query");
        this.r = bVar;
        this.s = bVar2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.f7.a;
        List list2 = kz0.f7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg0)) {
            return false;
        }
        yg0 yg0Var = (yg0) obj;
        return k71.k.b(this.r, yg0Var.r) && k71.k.b(this.s, yg0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.h00.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + f1.e.a(this.r, Integer.hashCode(30) * 31, 31);
    }

    public final String i() {
        return "b0b6b45c5e8f2089bff7165fbd57972bf4b301e423dee0069b49e4e874d62be3";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerTemplateRepositoriesQuery($first: Int!, $after: String, $query: String) { viewer { repositories(first: $first, after: $after, query: $query, type: TEMPLATE, orderBy: { field: NAME direction: ASC } ) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SimpleRepositoryFragment id } } id __typename } id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }";
    }

    public final String name() {
        return "ViewerTemplateRepositoriesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return "ViewerTemplateRepositoriesQuery(first=30, after=" + this.r + ", query=" + this.s + ")";
    }
}
