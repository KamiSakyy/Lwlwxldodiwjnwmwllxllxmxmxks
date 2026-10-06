package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 implements aaShadow.n0 {
    public static final x1 Companion = new x1();
    public String r;

    public a2(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.l.a;
        List list2 = h10.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && k71.k.b(this.r, ((a2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.b1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "fbab8860891aa92207a4ba784ea3ccfbae17b5ecbfdf0396a8f108eb1b8ebaa4";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddStar($id: ID!) { addStar(input: { starrableId: $id } ) { starrable { __typename ...NodeIdFragment ...RepositoryStarsFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }";
    }

    public final String name() {
        return "AddStar";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("AddStarMutation(id=", this.r, ")");
    }
}
