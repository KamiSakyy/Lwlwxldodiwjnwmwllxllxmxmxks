package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x60 {
    public final w60 a;

    public x60(w60 w60Var) {
        this.a = w60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x60) && k71.k.b(this.a, ((x60) obj).a);
    }

    public final int hashCode() {
        w60 w60Var = this.a;
        if (w60Var == null) {
            return 0;
        }
        return w60Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssue(issue=" + this.a + ")";
    }
}
