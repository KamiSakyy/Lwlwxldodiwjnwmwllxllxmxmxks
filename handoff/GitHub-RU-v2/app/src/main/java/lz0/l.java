package lz0;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import pz0.sk;
import pz0.vj;
import pz0.wj;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements n0 {
    public static final i Companion = new i();

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = nz0.c.a;
        List list2 = nz0.c.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        vj vjVar = wj.Companion;
        return true;
    }

    public final p0 g() {
        return aa.c.c(mz0.e.a, false);
    }

    public final int hashCode() {
        return wj.s.hashCode();
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
        vj vjVar = wj.Companion;
        fVar.I("AUTH");
    }

    public final String toString() {
        return "DeleteMobileDevicePublicKeyMutation(type=" + wj.s + ")";
    }
}
