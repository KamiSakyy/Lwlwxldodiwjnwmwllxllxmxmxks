package com.github.rudroid.copilot.inapppurchase;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final x9.l f9632a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f9633b;

    public a(x9.l lVar, l0 l0Var) {
        k71.k.g(l0Var, "subscriptionStatus");
        this.f9632a = lVar;
        this.f9633b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f9632a, aVar.f9632a) && k71.k.b(this.f9633b, aVar.f9633b);
    }

    public final int hashCode() {
        x9.l lVar = this.f9632a;
        return this.f9633b.hashCode() + ((lVar == null ? 0 : lVar.f34015a.hashCode()) * 31);
    }

    public final String toString() {
        return "BillingClientState(productDetails=" + this.f9632a + ", subscriptionStatus=" + this.f9633b + ")";
    }
}
