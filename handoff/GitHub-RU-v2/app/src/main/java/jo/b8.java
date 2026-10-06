package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b8 implements aaShadow.n0 {
    public static final u7 Companion = new u7();
    public final String r;
    public final String s;

    public b8(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.i0.a;
        List list2 = h10.i0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return k71.k.b(this.r, b8Var.r) && k71.k.b(this.s, b8Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.h5.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "793c7f77d2e533c510a052805b92f7681a82bdeb7f04bede8cddac3f961bd551";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateGoogleIapSubscriptionMutation($purchaseToken: String!, $productId: String!) { createGoogleIapSubscription(input: { purchaseToken: $purchaseToken productId: $productId } ) { clientMutationId copilot { success message } copilotProPlus { success message } copilotMax { success message } viewer { id copilotLicenseType __typename } } }";
    }

    public final String name() {
        return "CreateGoogleIapSubscriptionMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("purchaseToken");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("productId");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("CreateGoogleIapSubscriptionMutation(purchaseToken=", this.r, ", productId=", this.s, ")");
    }
}
