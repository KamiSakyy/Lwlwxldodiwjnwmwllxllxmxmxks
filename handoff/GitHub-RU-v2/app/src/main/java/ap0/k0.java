package ap0;

import java.util.List;
import pz0.w90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.i0 {
    public static final j0 Companion = new j0();

    public final aa.m d() {
        w90.Companion.getClass();
        aa.j0 j0Var = w90.a;
        k71.k.g(j0Var, "type");
        List list = bp0.g.a;
        List list2 = bp0.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == k0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(l0.a, true);
    }

    public final int hashCode() {
        return k71.x.a(k0.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
