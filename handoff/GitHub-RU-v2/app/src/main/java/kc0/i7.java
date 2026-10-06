package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i7 {
    public j7 a;

    public i7(j7 j7Var) {
        this.a = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7) && k71.k.b(this.a, ((i7) obj).a);
    }

    public final int hashCode() {
        j7 j7Var = this.a;
        if (j7Var == null) {
            return 0;
        }
        return j7Var.hashCode();
    }

    public final String toString() {
        return "CreateDashboardSearchShortcut(dashboard=" + this.a + ")";
    }
}
