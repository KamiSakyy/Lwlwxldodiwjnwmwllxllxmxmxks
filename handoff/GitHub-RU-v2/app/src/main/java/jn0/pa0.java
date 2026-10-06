package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pa0 {
    public na0 a;

    public pa0(na0 na0Var) {
        this.a = na0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa0) && k71.k.b(this.a, ((pa0) obj).a);
    }

    public final int hashCode() {
        na0 na0Var = this.a;
        if (na0Var == null) {
            return 0;
        }
        return na0Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssueIssueType(issue=" + this.a + ")";
    }
}
