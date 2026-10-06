package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h9 {
    public d9 a;
    public i9 b;

    public h9(d9 d9Var, i9 i9Var) {
        this.a = d9Var;
        this.b = i9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return k71.k.b(this.a, h9Var.a) && k71.k.b(this.b, h9Var.b);
    }

    public final int hashCode() {
        d9 d9Var = this.a;
        int hashCode = (d9Var == null ? 0 : d9Var.hashCode()) * 31;
        i9 i9Var = this.b;
        return hashCode + (i9Var != null ? i9Var.hashCode() : 0);
    }

    public final String toString() {
        return "DisablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
