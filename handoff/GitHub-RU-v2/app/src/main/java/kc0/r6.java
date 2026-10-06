package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 {
    public final t6 a;

    public r6(t6 t6Var) {
        this.a = t6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6) && k71.k.b(this.a, ((r6) obj).a);
    }

    public final int hashCode() {
        t6 t6Var = this.a;
        if (t6Var == null) {
            return 0;
        }
        return t6Var.hashCode();
    }

    public final String toString() {
        return "CreateIssue(issue=" + this.a + ")";
    }
}
