package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 implements aa.m0 {
    public final n0 a;

    public q0(n0 n0Var) {
        this.a = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && k71.k.b(this.a, ((q0) obj).a);
    }

    public final int hashCode() {
        n0 n0Var = this.a;
        if (n0Var == null) {
            return 0;
        }
        return n0Var.hashCode();
    }

    public final String toString() {
        return "Data(addDiscussionComment=" + this.a + ")";
    }
}
