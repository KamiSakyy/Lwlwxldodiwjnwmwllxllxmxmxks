package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uq implements aaShadow.n0 {
    public static final qq Companion = new qq();
    public String r;

    public uq(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.e3.a;
        List list2 = fc0.e3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uq) && k71.k.b(this.r, ((uq) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.hi.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "12be057106844d8353a9728dfc3f75e0337c244fedbccb128d5655119c8c6d02";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemoveStar($id: ID!) { removeStar(input: { starrableId: $id } ) { starrable { __typename ...NodeIdFragment ...RepositoryStarsFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }";
    }

    public final String name() {
        return "RemoveStar";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("RemoveStarMutation(id=", this.r, ")");
    }
}
