package com.github.rudroid.copilot;

import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.github.rudroid.utilities.ui.g1 f9402a;

    /* renamed from: b, reason: collision with root package name */
    public xn.b1 f9403b;

    /* renamed from: c, reason: collision with root package name */
    public Set f9404c;

    public a(com.github.rudroid.utilities.ui.g1 g1Var, xn.b1 b1Var, Set set) {
        k71.k.g(set, "dismissedBanners");
        this.f9402a = g1Var;
        this.f9403b = b1Var;
        this.f9404c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f9402a, aVar.f9402a) && k71.k.b(this.f9403b, aVar.f9403b) && k71.k.b(this.f9404c, aVar.f9404c);
    }

    public final int hashCode() {
        com.github.rudroid.utilities.ui.g1 g1Var = this.f9402a;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        xn.b1 b1Var = this.f9403b;
        return this.f9404c.hashCode() + ((hashCode + (b1Var != null ? b1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BannersModelSnapshot(modelToAcceptPolicy=" + this.f9402a + ", modelToRequireNewConversation=" + this.f9403b + ", dismissedBanners=" + this.f9404c + ")";
    }
}
