package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 {
    public final e2 a;
    public final f2 b;

    public b2(e2 e2Var, f2 f2Var) {
        this.a = e2Var;
        this.b = f2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return k71.k.b(this.a, b2Var.a) && k71.k.b(this.b, b2Var.b);
    }

    public final int hashCode() {
        e2 e2Var = this.a;
        int hashCode = (e2Var == null ? 0 : e2Var.hashCode()) * 31;
        f2 f2Var = this.b;
        return hashCode + (f2Var != null ? f2Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddSubIssue(issue=" + this.a + ", subIssue=" + this.b + ")";
    }
}
