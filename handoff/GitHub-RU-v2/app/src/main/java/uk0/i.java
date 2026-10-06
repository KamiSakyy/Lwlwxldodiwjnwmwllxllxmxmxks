package uk0;

import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import gn0.rn;
import java.util.List;
import k71.k;
import k71.xShadow;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements w0 {
    public static final e Companion = new e();

    public final m d() {
        rn.Companion.getClass();
        q0 q0Var = rn.z;
        k.g(q0Var, "type");
        List list = yk0.b.a;
        List list2 = yk0.b.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == i.class;
    }

    public final p0 g() {
        return aa.c.c(vk0.c.a, false);
    }

    public final int hashCode() {
        return xShadow.a(i.class).hashCode();
    }

    public final String i() {
        return "1cf432d5fe5ebe137279390aad394a81d4d7ac7a0fd2b94b84d5a7aeaa75f106";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerStarredCount { viewer { id starredRepositories { totalCount } __typename } }";
    }

    public final String name() {
        return "ViewerStarredCount";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
    }
}
