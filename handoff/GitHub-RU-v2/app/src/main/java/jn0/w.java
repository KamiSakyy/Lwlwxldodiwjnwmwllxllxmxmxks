package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements aaShadow.n0 {
    public static final u Companion = new u();
    public String r;
    public String s;

    public w(String str, String str2) {
        k71.k.g(str, "deviceToken");
        k71.k.g(str2, "deviceName");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.d.a;
        List list2 = kz0.d.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.r, wVar.r) && k71.k.b(this.s, wVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.o.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "a65407ba862cdc5ed7240b5ada1a7e6efbca4de7b8057d63c2b9e0bfb9329dee";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddMobileDeviceToken($deviceToken: String!, $deviceName: String!) { addMobileDeviceToken(input: { service: FCM deviceToken: $deviceToken deviceName: $deviceName } ) { success } }";
    }

    public final String name() {
        return "AddMobileDeviceToken";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("deviceToken");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("deviceName");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("AddMobileDeviceTokenMutation(deviceToken=", this.r, ", deviceName=", this.s, ")");
    }
    public Object e(Object p1) { return null; }
}
