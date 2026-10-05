package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o90 implements aa.m0 {
    public final q90 a;

    public o90(q90 q90Var) {
        this.a = q90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o90) && k71.k.b(this.a, ((o90) obj).a);
    }

    public final int hashCode() {
        q90 q90Var = this.a;
        if (q90Var == null) {
            return 0;
        }
        return q90Var.hashCode();
    }

    public final String toString() {
        return "Data(unresolveReviewThread=" + this.a + ")";
    }
}
