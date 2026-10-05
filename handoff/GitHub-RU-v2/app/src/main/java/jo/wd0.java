package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wd0 implements aa.m0 {
    public final xd0 a;

    public wd0(xd0 xd0Var) {
        this.a = xd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd0) && k71.k.b(this.a, ((wd0) obj).a);
    }

    public final int hashCode() {
        xd0 xd0Var = this.a;
        if (xd0Var == null) {
            return 0;
        }
        return xd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardPins=" + this.a + ")";
    }
}
