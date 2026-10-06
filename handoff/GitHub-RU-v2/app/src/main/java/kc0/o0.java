package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public u0 a;

    public o0(u0 u0Var) {
        this.a = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && k71.k.b(this.a, ((o0) obj).a);
    }

    public final int hashCode() {
        u0 u0Var = this.a;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.hashCode();
    }

    public final String toString() {
        return "AddPullRequestReviewThread(thread=" + this.a + ")";
    }
}
