package i10;

import a0.s0;
import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements n0 {
    public static final x Companion = new x();
    public int r;

    public a0(int i) {
        this.r = i;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = k10.f.a;
        List list2 = k10.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.r == ((a0) obj).r;
    }

    public final p0 g() {
        return aa.c.c(j10.n.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.r);
    }

    public final String i() {
        return "eddb0c08fa21c0bbb857efada6ba4b911b3c53f0b1e39047c6b4c62887b0eb50";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RejectMobileAuthDeviceRequest($requestId: Int!) { rejectMobileAuthDeviceRequest(input: { requestId: $requestId } ) { clientMutationId } }";
    }

    public final String name() {
        return "RejectMobileAuthDeviceRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("requestId");
        fVar.z(this.r);
    }

    public final String toString() {
        return s0.i("RejectMobileAuthDeviceRequestMutation(requestId=", this.r, ")");
    }

}
