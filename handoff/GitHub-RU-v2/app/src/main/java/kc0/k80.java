package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k80 {
    public final b80 a;
    public final j80 b;

    public k80(b80 b80Var, j80 j80Var) {
        this.a = b80Var;
        this.b = j80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return k71.k.b(this.a, k80Var.a) && k71.k.b(this.b, k80Var.b);
    }

    public final int hashCode() {
        b80 b80Var = this.a;
        int hashCode = (b80Var == null ? 0 : b80Var.hashCode()) * 31;
        j80 j80Var = this.b;
        return hashCode + (j80Var != null ? j80Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
