package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pf0 {
    public of0 a;

    public pf0(of0 of0Var) {
        this.a = of0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf0) && k71.k.b(this.a, ((pf0) obj).a);
    }

    public final int hashCode() {
        of0 of0Var = this.a;
        if (of0Var == null) {
            return 0;
        }
        return of0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequest(pullRequest=" + this.a + ")";
    }
}
