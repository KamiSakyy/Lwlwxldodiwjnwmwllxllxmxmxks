package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w1 {
    public z1 a;
    public a2 b;

    public w1(z1 z1Var, a2 a2Var) {
        this.a = z1Var;
        this.b = a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return k71.k.b(this.a, w1Var.a) && k71.k.b(this.b, w1Var.b);
    }

    public final int hashCode() {
        z1 z1Var = this.a;
        int hashCode = (z1Var == null ? 0 : z1Var.hashCode()) * 31;
        a2 a2Var = this.b;
        return hashCode + (a2Var != null ? a2Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddSubIssue(issue=" + this.a + ", subIssue=" + this.b + ")";
    }
}
