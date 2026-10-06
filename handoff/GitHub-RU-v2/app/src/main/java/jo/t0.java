package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public final z0 a;

    public t0(z0 z0Var) {
        this.a = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && k71.k.b(this.a, ((t0) obj).a);
    }

    public final int hashCode() {
        z0 z0Var = this.a;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.hashCode();
    }

    public final String toString() {
        return "AddPullRequestReviewThread(thread=" + this.a + ")";
    }
    public static final Object d = null;
}
