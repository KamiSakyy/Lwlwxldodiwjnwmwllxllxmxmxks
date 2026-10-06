package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gc0 implements aaShadow.w0 {
    public static final dc0 Companion = new dc0();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.o6.a;
        List list2 = en0.o6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == gc0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.zw.a, false);
    }

    public final int hashCode() {
        return k71.x.a(gc0.class).hashCode();
    }

    public final String i() {
        return "6d900e62a24b50c117574dde34aaa37f8f022ab4edb6f64b57c132c6678036bc";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerHasCreatedListsQuery { viewer { hasCreatedLists id __typename } }";
    }

    public final String name() {
        return "ViewerHasCreatedListsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
