package ow0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 {
    public final b1 a;

    public c1(b1 b1Var) {
        this.a = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && k71.k.b(this.a, ((c1) obj).a);
    }

    public final int hashCode() {
        b1 b1Var = this.a;
        if (b1Var == null) {
            return 0;
        }
        return b1Var.hashCode();
    }

    public final String toString() {
        return "UnpinIssue(issue=" + this.a + ")";
    }
}
