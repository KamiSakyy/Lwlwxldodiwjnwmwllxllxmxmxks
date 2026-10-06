package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bu implements aaShadow.n0 {
    public static final xt Companion = new xt();
    public final String r;

    public bu(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.p3.a;
        List list2 = kz0.p3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu) && k71.k.b(this.r, ((bu) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.rk.a, false);
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
