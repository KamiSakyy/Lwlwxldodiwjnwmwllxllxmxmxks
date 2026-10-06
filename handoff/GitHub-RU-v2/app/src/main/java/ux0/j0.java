package ux0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.w0 {
    public static final a0Shadow Companion = new a0Shadow();
    public String r;
    public String s;

    public j0(String str, String str2) {
        k71.k.g(str, "viewId");
        k71.k.g(str2, "itemDatabaseId");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = ey0.f.a;
        List list2 = ey0.f.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.r, j0Var.r) && k71.k.b(this.s, j0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(vx0.p.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "dca837afe96620a9db14ec14d3c8241d79a381f36ddb420faf7cd9ee609ecaf9";
    }

    public final String j() {
        Companion.getClass();
        return "query ProjectV2BoardItemSortValue($viewId: ID!, $itemDatabaseId: BigInt!) { node(id: $viewId) { __typename ... on ProjectV2View { id groups(first: 1, withItemDatabaseIds: [$itemDatabaseId]) { nodes { title items(first: 1) { nodes { sortValues { type value } } } viewGroupId __typename } } } id } id __typename }";
    }

    public final String name() {
        return "ProjectV2BoardItemSortValue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("viewId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("itemDatabaseId");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("ProjectV2BoardItemSortValueQuery(viewId=", this.r, ", itemDatabaseId=", this.s, ")");
    }
}
