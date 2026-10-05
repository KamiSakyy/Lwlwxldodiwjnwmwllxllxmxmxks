package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ba0 implements aa.m0 {
    public final ca0 a;

    public ba0(ca0 ca0Var) {
        this.a = ca0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba0) && k71.k.b(this.a, ((ba0) obj).a);
    }

    public final int hashCode() {
        ca0 ca0Var = this.a;
        if (ca0Var == null) {
            return 0;
        }
        return ca0Var.hashCode();
    }

    public final String toString() {
        return "Data(undoUserDisinterest=" + this.a + ")";
    }
}
