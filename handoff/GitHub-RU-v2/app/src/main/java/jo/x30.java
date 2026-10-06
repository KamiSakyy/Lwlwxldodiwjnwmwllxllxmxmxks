package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x30 implements aaShadow.m0 {
    public final y30 a;

    public x30(y30 y30Var) {
        this.a = y30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x30) && k71.k.b(this.a, ((x30) obj).a);
    }

    public final int hashCode() {
        y30 y30Var = this.a;
        if (y30Var == null) {
            return 0;
        }
        return y30Var.hashCode();
    }

    public final String toString() {
        return "Data(resolveReviewThread=" + this.a + ")";
    }
}
