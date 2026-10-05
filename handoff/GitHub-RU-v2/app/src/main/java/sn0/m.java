package sn0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import k71.x;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements w0 {
    public static final k Companion = new k();

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = un0.c.a;
        List list2 = un0.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == m.class;
    }

    public final p0 g() {
        return aa.c.c(tn0.g.a, false);
    }

    public final int hashCode() {
        return x.a(m.class).hashCode();
    }

    public final String i() {
        return "243501495dead436cef791d22c7cda348b9edd46a23fa479a42051c71ee78a87";
    }

    public final String j() {
        Companion.getClass();
        return "query MobileUpdatesUrl { mobileUpdatesUrl id __typename }";
    }

    public final String name() {
        return "MobileUpdatesUrl";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
