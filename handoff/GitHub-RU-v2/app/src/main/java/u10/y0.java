package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aaShadow.m0 {
    public w0 a;

    public y0(w0 w0Var) {
        this.a = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && k71.k.b(this.a, ((y0) obj).a);
    }

    public final int hashCode() {
        w0 w0Var = this.a;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.hashCode();
    }

    public final String toString() {
        return "Data(addPullRequestReview=" + this.a + ")";
    }
}
