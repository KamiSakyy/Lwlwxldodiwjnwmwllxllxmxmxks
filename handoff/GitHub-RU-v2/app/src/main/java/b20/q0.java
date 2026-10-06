package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 implements aa.v0 {
    public final r0 a;

    public q0(r0 r0Var) {
        this.a = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && k71.k.b(this.a, ((q0) obj).a);
    }

    public final int hashCode() {
        r0 r0Var = this.a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
