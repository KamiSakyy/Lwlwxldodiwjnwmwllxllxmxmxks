package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x6 {
    public v6 a;

    public x6(v6 v6Var) {
        this.a = v6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6) && k71.k.b(this.a, ((x6) obj).a);
    }

    public final int hashCode() {
        v6 v6Var = this.a;
        if (v6Var == null) {
            return 0;
        }
        return v6Var.hashCode();
    }

    public final String toString() {
        return "CreateCommitOnBranch(commit=" + this.a + ")";
    }
}
