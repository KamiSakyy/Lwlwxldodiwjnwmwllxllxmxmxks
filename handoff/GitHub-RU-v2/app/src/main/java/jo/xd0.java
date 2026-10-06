package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xd0 {
    public final yd0 a;

    public xd0(yd0 yd0Var) {
        this.a = yd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd0) && k71.k.b(this.a, ((xd0) obj).a);
    }

    public final int hashCode() {
        yd0 yd0Var = this.a;
        if (yd0Var == null) {
            return 0;
        }
        return yd0Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserDashboardPins(user=" + this.a + ")";
    }
    public Object a = null;
}
