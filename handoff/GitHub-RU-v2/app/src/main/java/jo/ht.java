package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ht implements aaShadow.w0 {
    public static final zs Companion = new zs();
    public final String r;
    public final m10.z00 s;
    public final aa.u0 t;

    public ht(String str, m10.z00 z00Var, aa.u0 u0Var) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = z00Var;
        this.t = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.o3.a;
        List list2 = h10.o3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        return k71.k.b(this.r, htVar.r) && this.s == htVar.s && this.t.equals(htVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.vj.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    public final String i() {
        return "36d7bad1f4a215970631ec479fd90269ab41f843e0ceeaad62643844d945caa2";
    }

    public final String j() {
        Companion.getClass();
        return "query Reactees($id: ID!, $content: ReactionContent!, $after: String) { node(id: $id) { __typename ... on Reactable { reactions(first: 25, after: $after, content: $content) { pageInfo { hasNextPage endCursor } nodes { user { __typename ...SimpleUserListItemFragment id } id __typename } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleUserListItemFragment on User { __typename id ...avatarFragment name login }";
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
