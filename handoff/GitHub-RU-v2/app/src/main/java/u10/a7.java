package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a7 {
    public b7 a;

    public a7(b7 b7Var) {
        this.a = b7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7) && k71.k.b(this.a, ((a7) obj).a);
    }

    public final int hashCode() {
        b7 b7Var = this.a;
        if (b7Var == null) {
            return 0;
        }
        return b7Var.hashCode();
    }

    public final String toString() {
        return "CreateDashboardSearchShortcut(dashboard=" + this.a + ")";
    }
}
