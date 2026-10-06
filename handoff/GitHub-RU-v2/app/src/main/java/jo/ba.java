package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ba implements aaShadow.n0 {
    public static final y9 Companion = new y9();
    public String r;

    public ba(String str) {
        k71.k.g(str, "deviceToken");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.r0.a;
        List list2 = h10.r0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && k71.k.b(this.r, ((ba) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.p6.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5ecd77c8e9ac2893b34af05a6edd6f33dd3b71a078a183fd8657e161a6c01741";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteMobileDeviceToken($deviceToken: String!) { deleteMobileDeviceToken(input: { service: FCM deviceToken: $deviceToken } ) { success } }";
    }

    public final String name() {
        return "DeleteMobileDeviceToken";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("deviceToken");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DeleteMobileDeviceTokenMutation(deviceToken=", this.r, ")");
    }
}
