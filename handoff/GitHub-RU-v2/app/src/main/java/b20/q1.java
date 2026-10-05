package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 implements aa.v0 {
    public final r1 a;

    public q1(r1 r1Var) {
        this.a = r1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && k71.k.b(this.a, ((q1) obj).a);
    }

    public final int hashCode() {
        r1 r1Var = this.a;
        if (r1Var == null) {
            return 0;
        }
        return r1Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
