package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e9 implements aa.n0 {
    public static final b9 Companion = new b9();
    public final String r;

    public e9(String str) {
        k71.k.g(str, "deviceToken");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.o0.a;
        List list2 = kz0.o0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9) && k71.k.b(this.r, ((e9) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.z5.a, false);
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
