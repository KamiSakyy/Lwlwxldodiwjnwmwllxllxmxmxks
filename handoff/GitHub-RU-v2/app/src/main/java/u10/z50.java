package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z50 {
    public final v50 a;
    public final String b;

    public z50(v50 v50Var, String str) {
        this.a = v50Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z50)) {
            return false;
        }
        z50 z50Var = (z50) obj;
        return k71.k.b(this.a, z50Var.a) && k71.k.b(this.b, z50Var.b);
    }

    public final int hashCode() {
        v50 v50Var = this.a;
        int hashCode = (v50Var == null ? 0 : v50Var.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequestBranch(pullRequest=" + this.a + ", clientMutationId=" + this.b + ")";
    }
}
