package i10;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import m10.vp;
import m10.wo;
import m10.xo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements n0 {
    public static final i Companion = new i();

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = k10.c.a;
        List list2 = k10.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        wo woVar = xo.Companion;
        return true;
    }

    public final p0 g() {
        return aa.c.c(j10.e.a, false);
    }

    public final int hashCode() {
        return xo.s.hashCode();
    }

    public final String i() {
        return "bfbec890a7daae2cf8765fccca243c8c9ea56d1b0eaad06d86edec78b6147173";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteMobileDevicePublicKey($type: MobileDeviceKeyType!) { deleteMobileDevicePublicKey(input: { type: $type } ) { clientMutationId } }";
    }

    public final String name() {
        return "DeleteMobileDevicePublicKey";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("type");
        wo woVar = xo.Companion;
        fVar.I("AUTH");
    }

    public final String toString() {
        return "DeleteMobileDevicePublicKeyMutation(type=" + xo.s + ")";
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }
}
