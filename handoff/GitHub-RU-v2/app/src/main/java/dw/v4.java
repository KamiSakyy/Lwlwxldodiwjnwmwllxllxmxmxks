package dw;

import java.util.List;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 implements aa.i0 {
    public static final u4 Companion = new u4();

    public final aa.m d() {
        wh.Companion.getClass();
        aa.q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        List list = ew.l.a;
        List list2 = ew.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == v4.class;
    }

    public final aa.p0 g() {
        return aa.c.c(c5.a, true);
    }

    public final int hashCode() {
        return k71.x.a(v4.class).hashCode();
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
