package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l70 {
    public final k70 a;

    public l70(k70 k70Var) {
        this.a = k70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l70) && k71.k.b(this.a, ((l70) obj).a);
    }

    public final int hashCode() {
        k70 k70Var = this.a;
        if (k70Var == null) {
            return 0;
        }
        return k70Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
