package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g50 implements aa.m0 {
    public final h50 a;

    public g50(h50 h50Var) {
        this.a = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g50) && k71.k.b(this.a, ((g50) obj).a);
    }

    public final int hashCode() {
        h50 h50Var = this.a;
        if (h50Var == null) {
            return 0;
        }
        return h50Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardPins=" + this.a + ")";
    }
}
