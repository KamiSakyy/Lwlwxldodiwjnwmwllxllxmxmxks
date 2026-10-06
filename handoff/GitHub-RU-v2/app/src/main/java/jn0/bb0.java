package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bb0 {
    public final ab0 a;

    public bb0(ab0 ab0Var) {
        this.a = ab0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb0) && k71.k.b(this.a, ((bb0) obj).a);
    }

    public final int hashCode() {
        ab0 ab0Var = this.a;
        if (ab0Var == null) {
            return 0;
        }
        return ab0Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssue(issue=" + this.a + ")";
    }
}
