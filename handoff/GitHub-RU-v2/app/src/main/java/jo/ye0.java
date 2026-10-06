package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ye0 {
    public te0 a;
    public xe0 b;

    public ye0(te0 te0Var, xe0 xe0Var) {
        this.a = te0Var;
        this.b = xe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye0)) {
            return false;
        }
        ye0 ye0Var = (ye0) obj;
        return k71.k.b(this.a, ye0Var.a) && k71.k.b(this.b, ye0Var.b);
    }

    public final int hashCode() {
        te0 te0Var = this.a;
        int hashCode = (te0Var == null ? 0 : te0Var.hashCode()) * 31;
        xe0 xe0Var = this.b;
        return hashCode + (xe0Var != null ? xe0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
