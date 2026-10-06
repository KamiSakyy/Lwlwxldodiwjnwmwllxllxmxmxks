package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q7 {
    public final s7 a;

    public q7(s7 s7Var) {
        this.a = s7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7) && k71.k.b(this.a, ((q7) obj).a);
    }

    public final int hashCode() {
        s7 s7Var = this.a;
        if (s7Var == null) {
            return 0;
        }
        return s7Var.hashCode();
    }

    public final String toString() {
        return "CreateDiscussion(discussion=" + this.a + ")";
    }
}
