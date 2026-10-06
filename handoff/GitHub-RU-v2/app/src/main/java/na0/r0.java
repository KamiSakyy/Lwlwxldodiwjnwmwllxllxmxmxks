package na0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.m0 {
    public final t0 a;

    public r0(t0 t0Var) {
        this.a = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && k71.k.b(this.a, ((r0) obj).a);
    }

    public final int hashCode() {
        t0 t0Var = this.a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public final String toString() {
        return "Data(unpinIssue=" + this.a + ")";
    }
}
