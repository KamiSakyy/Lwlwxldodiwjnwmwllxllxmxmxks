package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v8 {
    public w8 a;

    public v8(w8 w8Var) {
        this.a = w8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8) && k71.k.b(this.a, ((v8) obj).a);
    }

    public final int hashCode() {
        w8 w8Var = this.a;
        if (w8Var == null) {
            return 0;
        }
        return w8Var.hashCode();
    }

    public final String toString() {
        return "CreateDashboardSearchShortcut(dashboard=" + this.a + ")";
    }
}
