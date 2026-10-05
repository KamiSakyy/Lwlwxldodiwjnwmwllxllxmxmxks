package lz0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements w0 {
    public static final m Companion = new m();

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = nz0.d.a;
        List list2 = nz0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == q.class;
    }

    public final p0 g() {
        return aa.c.c(mz0.g.a, false);
    }

    public final int hashCode() {
        return k71.x.a(q.class).hashCode();
    }

    public final String i() {
        return "a0dd219aa6bcb5cf8b72f1ab0546778879d9302e21301b0fa5e93ecabba131df";
    }

    public final String j() {
        Companion.getClass();
        return "query ExpiredMobileAuthRequest { viewer { mobileAuthStatus { hasValidDeviceAuthKey hasExpiredAuthRequest } id __typename } id __typename }";
    }

    public final String name() {
        return "ExpiredMobileAuthRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
