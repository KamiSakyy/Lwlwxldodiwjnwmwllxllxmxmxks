package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a20 implements aaShadow.m0 {
    public final d20 a;

    public a20(d20 d20Var) {
        this.a = d20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a20) && k71.k.b(this.a, ((a20) obj).a);
    }

    public final int hashCode() {
        d20 d20Var = this.a;
        if (d20Var == null) {
            return 0;
        }
        return d20Var.hashCode();
    }

    public final String toString() {
        return "Data(submitPullRequestReview=" + this.a + ")";
    }
}
