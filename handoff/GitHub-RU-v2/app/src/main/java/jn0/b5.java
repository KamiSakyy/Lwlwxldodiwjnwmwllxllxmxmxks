package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b5 {
    public final e5 a;

    public b5(e5 e5Var) {
        this.a = e5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5) && k71.k.b(this.a, ((b5) obj).a);
    }

    public final int hashCode() {
        e5 e5Var = this.a;
        if (e5Var == null) {
            return 0;
        }
        return e5Var.hashCode();
    }

    public final String toString() {
        return "ClosePullRequest(pullRequest=" + this.a + ")";
    }
}
