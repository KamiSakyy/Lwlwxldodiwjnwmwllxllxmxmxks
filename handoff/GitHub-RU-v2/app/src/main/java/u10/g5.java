package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g5 implements aa.v0 {
    public final h5 a;

    public g5(h5 h5Var) {
        this.a = h5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5) && k71.k.b(this.a, ((g5) obj).a);
    }

    public final int hashCode() {
        h5 h5Var = this.a;
        if (h5Var == null) {
            return 0;
        }
        return h5Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
