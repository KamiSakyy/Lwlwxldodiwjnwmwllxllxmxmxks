package dl0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 {
    public final s0 a;

    public t0(s0 s0Var) {
        this.a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && k71.k.b(this.a, ((t0) obj).a);
    }

    public final int hashCode() {
        s0 s0Var = this.a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }

    public final String toString() {
        return "UnpinIssue(issue=" + this.a + ")";
    }
    public static final Object d = null;
}
