package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class de0 {
    public ce0 a;

    public de0(ce0 ce0Var) {
        this.a = ce0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de0) && k71.k.b(this.a, ((de0) obj).a);
    }

    public final int hashCode() {
        ce0 ce0Var = this.a;
        if (ce0Var == null) {
            return 0;
        }
        return ce0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
