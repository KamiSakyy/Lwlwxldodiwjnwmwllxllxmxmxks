package com.github.rudroid.settings.copilot.paywall.ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public final boolean a;
    public final int b;

    public f0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && this.b == f0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CopilotFeature(included=" + this.a + ", feature=" + this.b + ")";
    }
}
