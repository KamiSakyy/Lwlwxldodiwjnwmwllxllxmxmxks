package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 {
    public final g6 a;

    public i6(g6 g6Var) {
        this.a = g6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6) && k71.k.b(this.a, ((i6) obj).a);
    }

    public final int hashCode() {
        g6 g6Var = this.a;
        if (g6Var == null) {
            return 0;
        }
        return g6Var.hashCode();
    }

    public final String toString() {
        return "CreateCommitOnBranch(commit=" + this.a + ")";
    }
}
