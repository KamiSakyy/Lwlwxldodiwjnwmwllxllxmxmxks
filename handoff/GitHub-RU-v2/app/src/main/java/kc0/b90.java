package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b90 {
    public final a90 a;

    public b90(a90 a90Var) {
        this.a = a90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b90) && k71.k.b(this.a, ((b90) obj).a);
    }

    public final int hashCode() {
        a90 a90Var = this.a;
        if (a90Var == null) {
            return 0;
        }
        return a90Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
