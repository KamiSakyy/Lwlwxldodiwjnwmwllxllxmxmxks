package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 {
    public t1 a;
    public z b;

    public i1(t1 t1Var, z zVar) {
        this.a = t1Var;
        this.b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b);
    }

    public final int hashCode() {
        t1 t1Var = this.a;
        return this.b.hashCode() + ((t1Var == null ? 0 : t1Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldPullRequestValue(pullRequests=" + this.a + ", field=" + this.b + ")";
    }
}
