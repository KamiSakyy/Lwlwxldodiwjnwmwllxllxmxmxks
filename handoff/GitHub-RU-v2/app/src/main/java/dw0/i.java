package dw0;

import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import java.util.List;
import k71.k;
import k71.x;
import pz0.su;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements w0 {
    public static final e Companion = new e();

    public final m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k.g(q0Var, "type");
        List list = hw0.b.a;
        List list2 = hw0.b.a;
        k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == i.class;
    }

    public final p0 g() {
        return aa.c.c(ew0.c.a, false);
    }

    public final int hashCode() {
        return x.a(i.class).hashCode();
    }

    public final String i() {
        return "957f1fb052f6be1e3de68ec23bf6288e2f3f7cac2a6b14f7fc1e8a204e73be9d";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerStarredCount { viewer { id starredRepositories { totalCount } __typename } id __typename }";
    }

    public final String name() {
        return "ViewerStarredCount";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
    }
}
