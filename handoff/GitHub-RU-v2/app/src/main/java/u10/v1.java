package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 implements aa.n0 {
    public static final s1 Companion = new s1();
    public final String r;

    public v1(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.k.a;
        List list2 = fc0.k.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && k71.k.b(this.r, ((v1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.y0.a, false);
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
