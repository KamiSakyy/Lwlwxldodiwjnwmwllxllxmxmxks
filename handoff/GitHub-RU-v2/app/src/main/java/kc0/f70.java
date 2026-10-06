package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f70 {
    public g70 a;

    public f70(g70 g70Var) {
        this.a = g70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f70) && k71.k.b(this.a, ((f70) obj).a);
    }

    public final int hashCode() {
        g70 g70Var = this.a;
        if (g70Var == null) {
            return 0;
        }
        return g70Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserDashboardPins(user=" + this.a + ")";
    }
}
