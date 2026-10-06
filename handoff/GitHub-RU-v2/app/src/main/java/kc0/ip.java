package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ip implements aaShadow.w0 {
    public static final ap Companion = new ap();
    public final String r;
    public final gn0.bo s;
    public final aa.u0 t;

    public ip(String str, gn0.bo boVar, aa.u0 u0Var) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = boVar;
        this.t = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.a3.a;
        List list2 = en0.a3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        return k71.k.b(this.r, ipVar.r) && this.s == ipVar.s && this.t.equals(ipVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.zg.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    public final String i() {
        return "08b94f9684ff34b101d00cf6f26c72b1367f798a091e2b5b7bbe75460cf797dd";
    }

    public final String j() {
        Companion.getClass();
        return "query Reactees($id: ID!, $content: ReactionContent!, $after: String) { node(id: $id) { __typename ... on Reactable { reactions(first: 25, after: $after, content: $content) { pageInfo { hasNextPage endCursor } nodes { user { __typename ...SimpleUserListItemFragment id } id __typename } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleUserListItemFragment on User { __typename id ...avatarFragment name login }";
    }

    public final String name() {
        return "Reactees";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("content");
        fVar.I(this.s.r);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReacteesQuery(id=");
        sb.append(this.r);
        sb.append(", content=");
        sb.append(this.s);
        sb.append(", after=");
        return f1.e.j(sb, this.t, ")");
    }
}
