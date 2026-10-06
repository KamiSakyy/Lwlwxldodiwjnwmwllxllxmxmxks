package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class re0 {
    public ne0 a;
    public String b;

    public re0(ne0 ne0Var, String str) {
        this.a = ne0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re0)) {
            return false;
        }
        re0 re0Var = (re0) obj;
        return k71.k.b(this.a, re0Var.a) && k71.k.b(this.b, re0Var.b);
    }

    public final int hashCode() {
        ne0 ne0Var = this.a;
        int hashCode = (ne0Var == null ? 0 : ne0Var.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequestBranch(pullRequest=" + this.a + ", clientMutationId=" + this.b + ")";
    }
}
