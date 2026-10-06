package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wd0 {
    public vd0 a;

    public wd0(vd0 vd0Var) {
        this.a = vd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd0) && k71.k.b(this.a, ((wd0) obj).a);
    }

    public final int hashCode() {
        vd0 vd0Var = this.a;
        if (vd0Var == null) {
            return 0;
        }
        return vd0Var.hashCode();
    }

    public final String toString() {
        return "UpdateDashboardSearchShortcut(shortcut=" + this.a + ")";
    }
}
