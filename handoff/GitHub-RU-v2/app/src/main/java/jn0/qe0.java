package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qe0 implements aaShadow.w0 {
    public static final ne0 Companion = new ne0();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.u6.a;
        List list2 = kz0.u6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == qe0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.zy.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(qe0.class).hashCode();
    }

    public final String i() {
        return "459fa01e6330179e103be124a5d02e05f1f944a1ecdf0322010e161434904fce";
    }

    public final String j() {
        Companion.getClass();
        return "query UserAccountInfoQuery { viewer { __typename ...actorFields name id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }";
    }

    public final String name() {
        return "UserAccountInfoQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
