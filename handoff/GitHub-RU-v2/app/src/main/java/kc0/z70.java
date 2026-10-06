package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z70 {
    public v70 a;
    public String b;

    public z70(v70 v70Var, String str) {
        this.a = v70Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj;
        return k71.k.b(this.a, z70Var.a) && k71.k.b(this.b, z70Var.b);
    }

    public final int hashCode() {
        v70 v70Var = this.a;
        int hashCode = (v70Var == null ? 0 : v70Var.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequestBranch(pullRequest=" + this.a + ", clientMutationId=" + this.b + ")";
    }
}
