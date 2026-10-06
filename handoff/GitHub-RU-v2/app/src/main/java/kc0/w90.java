package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w90 {
    public v90 a;

    public w90(v90 v90Var) {
        this.a = v90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w90) && k71.k.b(this.a, ((w90) obj).a);
    }

    public final int hashCode() {
        v90 v90Var = this.a;
        if (v90Var == null) {
            return 0;
        }
        return v90Var.hashCode();
    }

    public final String toString() {
        return "UpdateDashboardSearchShortcut(shortcut=" + this.a + ")";
    }
}
