package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w70 {
    public final v70 a;

    public w70(v70 v70Var) {
        this.a = v70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w70) && k71.k.b(this.a, ((w70) obj).a);
    }

    public final int hashCode() {
        v70 v70Var = this.a;
        if (v70Var == null) {
            return 0;
        }
        return v70Var.hashCode();
    }

    public final String toString() {
        return "UpdateDashboardSearchShortcut(shortcut=" + this.a + ")";
    }
}
