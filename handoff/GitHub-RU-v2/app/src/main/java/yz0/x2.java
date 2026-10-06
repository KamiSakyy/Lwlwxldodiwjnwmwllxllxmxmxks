package yz0;

import com.github.service.models.response.type.MinimizedStateReason;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 {
    public static final w2 Companion = new w2();
    public static final x2 e = new x2(false, false, false, null);
    public boolean a;
    public boolean b;
    public boolean c;
    public MinimizedStateReason d;

    public x2(boolean z, boolean z2, boolean z3, MinimizedStateReason minimizedStateReason) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = minimizedStateReason;
    }

    public static x2 a(x2 x2Var, boolean z) {
        boolean z2 = x2Var.a;
        boolean z3 = x2Var.c;
        MinimizedStateReason minimizedStateReason = x2Var.d;
        x2Var.getClass();
        return new x2(z2, z, z3, minimizedStateReason);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.a == x2Var.a && this.b == x2Var.b && this.c == x2Var.c && this.d == x2Var.d;
    }

    public final int hashCode() {
        int e2 = x.i.e(x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        MinimizedStateReason minimizedStateReason = this.d;
        return e2 + (minimizedStateReason == null ? 0 : minimizedStateReason.hashCode());
    }

    public final String toString() {
        StringBuilder u = com.github.rudroid.copilot.h1.u("MinimizedState(isMinimized=", this.a, ", isUiCommentCollapsed=", this.b, ", viewerCanMinimize=");
        u.append(this.c);
        u.append(", minimizedReason=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }

    public x2(Object... a) {
    }
}
