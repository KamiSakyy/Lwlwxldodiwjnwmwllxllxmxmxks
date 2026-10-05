package i10;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements w0 {
    public static final s Companion = new s();

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = k10.e.a;
        List list2 = k10.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == w.class;
    }

    public final p0 g() {
        return aa.c.c(j10.k.a, false);
    }

    public final int hashCode() {
        return k71.x.a(w.class).hashCode();
    }

    public final String i() {
        return "bc833e67623b403c07e87ba8348cbd3506ac609e1164a5e7de6a64f67660bdfa";
    }

    public final String j() {
        Companion.getClass();
        return "query MobileAuthRequests { viewer { email primaryEmail login mobileAuthStatus { hasValidDeviceAuthKey hasExpiredAuthRequest activeAuthRequest { id payload challengeRequired type } } id __typename } id __typename }";
    }

    public final String name() {
        return "MobileAuthRequests";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

}
