package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p9 {
    public final l9 a;
    public final q9 b;

    public p9(l9 l9Var, q9 q9Var) {
        this.a = l9Var;
        this.b = q9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return k71.k.b(this.a, p9Var.a) && k71.k.b(this.b, p9Var.b);
    }

    public final int hashCode() {
        l9 l9Var = this.a;
        int hashCode = (l9Var == null ? 0 : l9Var.hashCode()) * 31;
        q9 q9Var = this.b;
        return hashCode + (q9Var != null ? q9Var.hashCode() : 0);
    }

    public final String toString() {
        return "DisablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
