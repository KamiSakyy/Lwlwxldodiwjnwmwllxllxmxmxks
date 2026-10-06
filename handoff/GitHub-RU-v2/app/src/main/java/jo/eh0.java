package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eh0 implements aaShadow.w0 {
    public static final bh0 Companion = new bh0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.d7.a;
        List list2 = h10.d7.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == eh0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.u00.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(eh0.class).hashCode();
    }

    public final String i() {
        return "9dc6b2d19f555901f60cb4c7c321d2dd26ef7dbd9008d63fdb6e82edfc500137";
    }

    public final String j() {
        Companion.getClass();
        return "query UserAccountInfoQuery { viewer { __typename ...actorFields name id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }";
    }

    public final String name() {
        return "UserAccountInfoQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
