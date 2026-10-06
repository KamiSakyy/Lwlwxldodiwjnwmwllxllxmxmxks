package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kc0 {
    public final fc0 a;
    public final jc0 b;

    public kc0(fc0 fc0Var, jc0 jc0Var) {
        this.a = fc0Var;
        this.b = jc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc0)) {
            return false;
        }
        kc0 kc0Var = (kc0) obj;
        return k71.k.b(this.a, kc0Var.a) && k71.k.b(this.b, kc0Var.b);
    }

    public final int hashCode() {
        fc0 fc0Var = this.a;
        int hashCode = (fc0Var == null ? 0 : fc0Var.hashCode()) * 31;
        jc0 jc0Var = this.b;
        return hashCode + (jc0Var != null ? jc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdatePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
