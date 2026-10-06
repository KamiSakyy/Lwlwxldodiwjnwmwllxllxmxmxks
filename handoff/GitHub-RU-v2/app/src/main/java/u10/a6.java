package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 {
    public final y5 a;

    public a6(y5 y5Var) {
        this.a = y5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6) && k71.k.b(this.a, ((a6) obj).a);
    }

    public final int hashCode() {
        y5 y5Var = this.a;
        if (y5Var == null) {
            return 0;
        }
        return y5Var.hashCode();
    }

    public final String toString() {
        return "CreateCommitOnBranch(commit=" + this.a + ")";
    }
}
