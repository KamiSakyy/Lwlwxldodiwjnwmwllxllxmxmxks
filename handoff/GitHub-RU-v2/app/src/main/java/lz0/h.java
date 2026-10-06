package lz0;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements n0 {
    public static final f Companion = new f();
    public final int r;
    public final String s;

    public h(String str, int i) {
        this.r = i;
        this.s = str;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = nz0.b.a;
        List list2 = nz0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.r == hVar.r && k71.k.b(this.s, hVar.s);
    }

    public final p0 g() {
        return aa.c.c(mz0.d.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (Integer.hashCode(this.r) * 31);
    }

    public final String i() {
        return "3744e445e3307af1411c82d739a3c1ce08b0bbdb36ecdaa9b57fffff462a7fcb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ApproveMobileAuthDeviceRequest($requestId: Int!, $signature: String!) { approveMobileAuthDeviceRequest(input: { requestId: $requestId signature: $signature signatureVersion: V1 } ) { clientMutationId } }";
    }

    public final String name() {
        return "ApproveMobileAuthDeviceRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("requestId");
        fVar.z(this.r);
        fVar.z0("signature");
        aa.c.a.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return "ApproveMobileAuthDeviceRequestMutation(requestId=" + this.r + ", signature=" + this.s + ")";
    }
}
