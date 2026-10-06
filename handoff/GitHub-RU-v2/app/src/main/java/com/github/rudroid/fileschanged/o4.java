package com.github.rudroid.fileschanged;

/* loaded from: /home/user/work/p/classes.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13421a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13422b;

    public o4(boolean z10, boolean z11) {
        this.f13421a = z10;
        this.f13422b = z11;
    }

    public static o4 a(o4 o4Var, boolean z10, int i) {
        if ((i & 1) != 0) {
            z10 = o4Var.f13421a;
        }
        return new o4(z10, (i & 2) != 0 ? o4Var.f13422b : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return this.f13421a == o4Var.f13421a && this.f13422b == o4Var.f13422b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13422b) + (Boolean.hashCode(this.f13421a) * 31);
    }

    public final String toString() {
        return "RenderingState(fileCollapsed=" + this.f13421a + ", contentSkipped=" + this.f13422b + ")";
    }
}
