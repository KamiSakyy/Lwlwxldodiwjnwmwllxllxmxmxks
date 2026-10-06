package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jf0 {
    public af0 a;
    public hf0 b;

    public jf0(af0 af0Var, hf0 hf0Var) {
        this.a = af0Var;
        this.b = hf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf0)) {
            return false;
        }
        jf0 jf0Var = (jf0) obj;
        return k71.k.b(this.a, jf0Var.a) && k71.k.b(this.b, jf0Var.b);
    }

    public final int hashCode() {
        af0 af0Var = this.a;
        int hashCode = (af0Var == null ? 0 : af0Var.hashCode()) * 31;
        hf0 hf0Var = this.b;
        return hashCode + (hf0Var != null ? hf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestReviews(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
