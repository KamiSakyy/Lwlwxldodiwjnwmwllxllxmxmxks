package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aaShadow.m0 {
    public final t0 a;

    public w0(t0 t0Var) {
        this.a = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && k71.k.b(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        t0 t0Var = this.a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public final String toString() {
        return "Data(addPullRequestReviewThread=" + this.a + ")";
    }
}
