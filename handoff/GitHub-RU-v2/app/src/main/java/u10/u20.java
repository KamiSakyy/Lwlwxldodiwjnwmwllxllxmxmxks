package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u20 implements aa.m0 {
    public final y20 a;

    public u20(y20 y20Var) {
        this.a = y20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u20) && k71.k.b(this.a, ((u20) obj).a);
    }

    public final int hashCode() {
        y20 y20Var = this.a;
        if (y20Var == null) {
            return 0;
        }
        return y20Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkFileAsViewed=" + this.a + ")";
    }
}
