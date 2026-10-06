package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c2 {
    public final b2 a;

    public c2(b2 b2Var) {
        this.a = b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && k71.k.b(this.a, ((c2) obj).a);
    }

    public final int hashCode() {
        b2 b2Var = this.a;
        if (b2Var == null) {
            return 0;
        }
        return b2Var.hashCode();
    }

    public final String toString() {
        return "UnpinIssue(issue=" + this.a + ")";
    }
}
