package com.github.rudroid.copilot.inapppurchase;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public k0 f9718a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f9719b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f9720c;

    public l0(k0 k0Var, j0 j0Var, i0 i0Var) {
        this.f9718a = k0Var;
        this.f9719b = j0Var;
        this.f9720c = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f9718a == l0Var.f9718a && this.f9719b == l0Var.f9719b && this.f9720c == l0Var.f9720c;
    }

    public final int hashCode() {
        k0 k0Var = this.f9718a;
        int hashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        j0 j0Var = this.f9719b;
        int hashCode2 = (hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        i0 i0Var = this.f9720c;
        return hashCode2 + (i0Var != null ? i0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CopilotSubscriptionState(state=" + this.f9718a + ", loadingState=" + this.f9719b + ", errorState=" + this.f9720c + ")";
    }
    public Object t(Object p1) { return null; }
}
