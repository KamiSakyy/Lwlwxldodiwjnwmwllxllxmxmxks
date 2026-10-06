package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y7 {
    public final z7 a;

    public y7(z7 z7Var) {
        this.a = z7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7) && k71.k.b(this.a, ((y7) obj).a);
    }

    public final int hashCode() {
        z7 z7Var = this.a;
        if (z7Var == null) {
            return 0;
        }
        return z7Var.hashCode();
    }

    public final String toString() {
        return "CreateDashboardSearchShortcut(dashboard=" + this.a + ")";
    }
}
