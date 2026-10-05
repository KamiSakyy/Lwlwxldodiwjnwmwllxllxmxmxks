package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qa0 implements aa.w0 {
    public static final na0 Companion = new na0();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.g6.a;
        List list2 = en0.g6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == qa0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.aw.a, false);
    }

    public final int hashCode() {
        return k71.x.a(qa0.class).hashCode();
    }

    public final String i() {
        return "1501f4e1737cc3deb7b3f60e6fab60867c7aca6e9b1adbf2c61d406735bf20a1";
    }

    public final String j() {
        Companion.getClass();
        return "query UserAccountInfoQuery { viewer { __typename ...actorFields name id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }";
    }

    public final String name() {
        return "UserAccountInfoQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
