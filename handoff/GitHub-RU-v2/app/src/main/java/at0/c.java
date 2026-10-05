package at0;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import k71.x;
import pz0.gj;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements i0 {
    public static final b Companion = new b();

    public final m d() {
        gj.Companion.getClass();
        j0 j0Var = gj.a;
        k.g(j0Var, "type");
        List list = bt0.a.a;
        List list2 = bt0.a.a;
        k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == c.class;
    }

    public final p0 g() {
        return aa.c.c(d.a, true);
    }

    public final int hashCode() {
        return x.a(c.class).hashCode();
    }

    public final void o(f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
    }
}
