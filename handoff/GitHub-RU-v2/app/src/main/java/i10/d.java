package i10;

import aa.n0;
import aa.p0;
import aa.q0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import jo.f4;
import m10.vp;
import m10.xo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements n0 {
    public static final b Companion = new b();
    public final String r;
    public final xo s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final boolean x;

    public d(String str, xo xoVar, String str2, String str3, String str4, String str5, boolean z) {
        k71.k.g(str2, "verificationSignature");
        k71.k.g(str5, "deviceModel");
        this.r = str;
        this.s = xoVar;
        this.t = str2;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = z;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = k10.a.a;
        List list2 = k10.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.r, dVar.r) && this.s == dVar.s && k71.k.b(this.t, dVar.t) && k71.k.b(this.u, dVar.u) && k71.k.b(this.v, dVar.v) && k71.k.b(this.w, dVar.w) && this.x == dVar.x;
    }

    public final p0 g() {
        return aa.c.c(j10.b.a, false);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + h1.i(h1.i(h1.i(h1.i((this.s.hashCode() + (this.r.hashCode() * 31)) * 31, this.t, 31), this.u, 31), this.v, 31), this.w, 31);
    }

    public final String i() {
        return "b69e3a5a481e716ac3d830d759bdfbd18acf2defd1070216ed87033eb4b9bc52";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddMobileDevicePublicKey($publicKey: String!, $type: MobileDeviceKeyType!, $verificationSignature: String!, $verificationMessage: String!, $deviceName: String!, $deviceModel: String!, $isHardwareBacked: Boolean!) { addMobileDevicePublicKey(input: { publicKey: $publicKey verificationSignature: $verificationSignature verificationMessage: $verificationMessage type: $type deviceName: $deviceName deviceModel: $deviceModel deviceOs: ANDROID isHardwareBacked: $isHardwareBacked } ) { clientMutationId } }";
    }

    public final String name() {
        return "AddMobileDevicePublicKey";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("publicKey");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("type");
        fVar.I(this.s.r);
        fVar.z0("verificationSignature");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("verificationMessage");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("deviceName");
        bVar.b(fVar, wVar, this.v);
        fVar.z0("deviceModel");
        bVar.b(fVar, wVar, this.w);
        fVar.z0("isHardwareBacked");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(this.x));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddMobileDevicePublicKeyMutation(publicKey=");
        sb.append(this.r);
        sb.append(", type=");
        sb.append(this.s);
        sb.append(", verificationSignature=");
        f1.e.x(sb, this.t, ", verificationMessage=", this.u, ", deviceName=");
        f1.e.x(sb, this.v, ", deviceModel=", this.w, ", isHardwareBacked=");
        return f4.s(sb, this.x, ")");
    }

}
