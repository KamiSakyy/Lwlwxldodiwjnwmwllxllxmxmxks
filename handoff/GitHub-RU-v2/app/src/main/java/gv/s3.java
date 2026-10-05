package gv;

import java.util.List;
import m10.ux;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s3 implements aa.i0 {
    public static final r3 Companion = new r3();

    public final aa.m d() {
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        List list = hv.j.a;
        List list2 = hv.j.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == s3.class;
    }

    public final aa.p0 g() {
        return aa.c.c(t3.a, false);
    }

    public final int hashCode() {
        return k71.x.a(s3.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
