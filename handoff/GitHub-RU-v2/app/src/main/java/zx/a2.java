package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 implements aa.m0 {
    public c2 a;

    public a2(c2 c2Var) {
        this.a = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && k71.k.b(this.a, ((a2) obj).a);
    }

    public final int hashCode() {
        c2 c2Var = this.a;
        if (c2Var == null) {
            return 0;
        }
        return c2Var.hashCode();
    }

    public final String toString() {
        return "Data(unpinIssue=" + this.a + ")";
    }
}
