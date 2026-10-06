package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kg0 {
    public jg0 a;

    public kg0(jg0 jg0Var) {
        this.a = jg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg0) && k71.k.b(this.a, ((kg0) obj).a);
    }

    public final int hashCode() {
        jg0 jg0Var = this.a;
        if (jg0Var == null) {
            return 0;
        }
        return jg0Var.hashCode();
    }

    public final String toString() {
        return "UpdateDashboardSearchShortcut(shortcut=" + this.a + ")";
    }
}
