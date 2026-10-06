package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u70 implements aaShadow.m0 {
    public w70 a;

    public u70(w70 w70Var) {
        this.a = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u70) && k71.k.b(this.a, ((u70) obj).a);
    }

    public final int hashCode() {
        w70 w70Var = this.a;
        if (w70Var == null) {
            return 0;
        }
        return w70Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDashboardSearchShortcut=" + this.a + ")";
    }
}
