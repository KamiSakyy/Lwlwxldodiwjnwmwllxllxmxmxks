package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h5 implements aa.m0 {
    public final f5 a;

    public h5(f5 f5Var) {
        this.a = f5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5) && k71.k.b(this.a, ((h5) obj).a);
    }

    public final int hashCode() {
        f5 f5Var = this.a;
        if (f5Var == null) {
            return 0;
        }
        return f5Var.hashCode();
    }

    public final String toString() {
        return "Data(closeIssue=" + this.a + ")";
    }
}
