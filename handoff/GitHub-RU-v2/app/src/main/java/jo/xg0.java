package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xg0 implements aa.m0 {
    public final zg0 a;

    public xg0(zg0 zg0Var) {
        this.a = zg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg0) && k71.k.b(this.a, ((xg0) obj).a);
    }

    public final int hashCode() {
        zg0 zg0Var = this.a;
        if (zg0Var == null) {
            return 0;
        }
        return zg0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardNavLinks=" + this.a + ")";
    }
}
