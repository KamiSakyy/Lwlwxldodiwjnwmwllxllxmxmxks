package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 {
    public t4 a;

    public q4(t4 t4Var) {
        this.a = t4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4) && k71.k.b(this.a, ((q4) obj).a);
    }

    public final int hashCode() {
        t4 t4Var = this.a;
        if (t4Var == null) {
            return 0;
        }
        return t4Var.hashCode();
    }

    public final String toString() {
        return "CloseIssue(issue=" + this.a + ")";
    }
}
