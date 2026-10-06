package com.github.rudroid.copilot;

/* loaded from: /home/user/work/p/classes.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public xn.b1 f9542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9543b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9544c;

    public e5(xn.b1 b1Var, boolean z10, boolean z11) {
        k71.k.g(b1Var, "aiModel");
        this.f9542a = b1Var;
        this.f9543b = z10;
        this.f9544c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return k71.k.b(this.f9542a, e5Var.f9542a) && this.f9543b == e5Var.f9543b && this.f9544c == e5Var.f9544c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9544c) + x.i.e(this.f9542a.hashCode() * 31, 31, this.f9543b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelPickerUiModel(aiModel=");
        sb2.append(this.f9542a);
        sb2.append(", isFallback=");
        sb2.append(this.f9543b);
        sb2.append(", isLocked=");
        return jo.f4Shadow.s(sb2, this.f9544c, ")");
    }
}
