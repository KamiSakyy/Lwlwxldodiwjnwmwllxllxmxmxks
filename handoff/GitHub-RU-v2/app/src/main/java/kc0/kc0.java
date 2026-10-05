package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kc0 implements aa.w0 {
    public static final hc0 Companion = new hc0();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.p6.a;
        List list2 = en0.p6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == kc0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.bx.a, false);
    }

    public final int hashCode() {
        return k71.x.a(kc0.class).hashCode();
    }

    public final String i() {
        return "683799b8b8f53b14bae293cf8b37eacd822b345c118c2d84db8ee084d889c122";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerIsStaffQuery { viewer { isEmployee id __typename } }";
    }

    public final String name() {
        return "ViewerIsStaffQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
