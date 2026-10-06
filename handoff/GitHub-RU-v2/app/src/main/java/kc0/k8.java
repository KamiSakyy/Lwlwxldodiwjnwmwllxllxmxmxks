package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k8 implements aaShadow.n0 {
    public static final h8 Companion = new h8();
    public String r;

    public k8(String str) {
        k71.k.g(str, "deviceToken");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.l0.a;
        List list2 = en0.l0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8) && k71.k.b(this.r, ((k8) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.l5.a, false);
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
