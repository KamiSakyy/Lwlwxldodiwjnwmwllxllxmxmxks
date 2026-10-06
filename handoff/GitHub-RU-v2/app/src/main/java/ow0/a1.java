package ow0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 implements aa.m0 {
    public c1 a;

    public a1(c1 c1Var) {
        this.a = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && k71.k.b(this.a, ((a1) obj).a);
    }

    public final int hashCode() {
        c1 c1Var = this.a;
        if (c1Var == null) {
            return 0;
        }
        return c1Var.hashCode();
    }

    public final String toString() {
        return "Data(unpinIssue=" + this.a + ")";
    }
}
