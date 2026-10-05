package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.n0 {
    public static final z Companion = new z();
    public final String r;
    public final String s;
    public final aa1.b t;
    public final aa1.b u;

    public b0(aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "deviceToken");
        k71.k.g(str2, "deviceName");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = bVar2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.e.a;
        List list2 = h10.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.r, b0Var.r) && k71.k.b(this.s, b0Var.s) && k71.k.b(this.t, b0Var.t) && k71.k.b(this.u, b0Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.r.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "c895cb06a41ba99d31fb2304b869b17db16a8129dd892dfff03e7eca067d2631";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddMobileDeviceToken($deviceToken: String!, $deviceName: String!, $encryptionKey: String, $hmacKey: String) { addMobileDeviceToken(input: { service: FCM deviceToken: $deviceToken deviceName: $deviceName encryptionKey: $encryptionKey hmacKey: $hmacKey platform: 1 } ) { success } }";
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
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("encryptionKey");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("hmacKey");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return f1.e.l(a0.s0.o("AddMobileDeviceTokenMutation(deviceToken=", this.r, ", deviceName=", this.s, ", encryptionKey="), this.t, ", hmacKey=", this.u, ")");
    }
}
