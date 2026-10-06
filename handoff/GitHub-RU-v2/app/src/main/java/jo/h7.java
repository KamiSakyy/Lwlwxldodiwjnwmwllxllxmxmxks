package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h7 {
    public final f7 a;

    public h7(f7 f7Var) {
        this.a = f7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7) && k71.k.b(this.a, ((h7) obj).a);
    }

    public final int hashCode() {
        f7 f7Var = this.a;
        if (f7Var == null) {
            return 0;
        }
        return f7Var.hashCode();
    }

    public final String toString() {
        return "CreateCommitOnBranch(commit=" + this.a + ")";
    }
}
