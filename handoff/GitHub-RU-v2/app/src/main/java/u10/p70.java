package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p70 implements aaShadow.m0 {
    public r70 a;

    public p70(r70 r70Var) {
        this.a = r70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p70) && k71.k.b(this.a, ((p70) obj).a);
    }

    public final int hashCode() {
        r70 r70Var = this.a;
        if (r70Var == null) {
            return 0;
        }
        return r70Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReview=" + this.a + ")";
    }
}
