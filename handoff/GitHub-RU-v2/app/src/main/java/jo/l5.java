package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l5 {
    public final o5 a;

    public l5(o5 o5Var) {
        this.a = o5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5) && k71.k.b(this.a, ((l5) obj).a);
    }

    public final int hashCode() {
        o5 o5Var = this.a;
        if (o5Var == null) {
            return 0;
        }
        return o5Var.hashCode();
    }

    public final String toString() {
        return "ClosePullRequest(pullRequest=" + this.a + ")";
    }
}
