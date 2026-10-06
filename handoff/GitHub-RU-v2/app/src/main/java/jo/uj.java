package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uj implements aaShadow.n0 {
    public static final oj Companion = new oj();
    public String r;
    public String s;

    public uj(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.c2.a;
        List list2 = h10.c2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj)) {
            return false;
        }
        uj ujVar = (uj) obj;
        return k71.k.b(this.r, ujVar.r) && k71.k.b(this.s, ujVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ld.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "55b89208e8fe31c34c6b031a6b76abbe2151de98ca0104d99c40280589e8f494";
    }

    public final String j() {
        Companion.getClass();
        return "mutation LegacyCreateGoogleIapSubscriptionMutation($purchaseToken: String!, $productId: String!) { createGoogleIapSubscription(input: { purchaseToken: $purchaseToken productId: $productId } ) { clientMutationId copilot { success message } copilotProPlus { success message } viewer { id copilotLicenseType __typename } } }";
    }

    public final String name() {
        return "LegacyCreateGoogleIapSubscriptionMutation";
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
        return x.i.g("LegacyCreateGoogleIapSubscriptionMutation(purchaseToken=", this.r, ", productId=", this.s, ")");
    }
}
