package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dc0 {
    public zb0 a;
    public String b;

    public dc0(zb0 zb0Var, String str) {
        this.a = zb0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc0)) {
            return false;
        }
        dc0 dc0Var = (dc0) obj;
        return k71.k.b(this.a, dc0Var.a) && k71.k.b(this.b, dc0Var.b);
    }

    public final int hashCode() {
        zb0 zb0Var = this.a;
        int hashCode = (zb0Var == null ? 0 : zb0Var.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequestBranch(pullRequest=" + this.a + ", clientMutationId=" + this.b + ")";
    }
}
