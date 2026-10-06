package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p90 implements aaShadow.m0 {
    public r90 a;

    public p90(r90 r90Var) {
        this.a = r90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p90) && k71.k.b(this.a, ((p90) obj).a);
    }

    public final int hashCode() {
        r90 r90Var = this.a;
        if (r90Var == null) {
            return 0;
        }
        return r90Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReview=" + this.a + ")";
    }
}
