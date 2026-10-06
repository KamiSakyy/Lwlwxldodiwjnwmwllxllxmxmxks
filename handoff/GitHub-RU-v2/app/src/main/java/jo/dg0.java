package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dg0 implements aaShadow.m0 {
    public fg0 a;

    public dg0(fg0 fg0Var) {
        this.a = fg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg0) && k71.k.b(this.a, ((dg0) obj).a);
    }

    public final int hashCode() {
        fg0 fg0Var = this.a;
        if (fg0Var == null) {
            return 0;
        }
        return fg0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReview=" + this.a + ")";
    }
}
