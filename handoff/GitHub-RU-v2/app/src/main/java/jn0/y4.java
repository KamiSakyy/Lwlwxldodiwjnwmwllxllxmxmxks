package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 implements aaShadow.m0 {
    public final w4 a;

    public y4(w4 w4Var) {
        this.a = w4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4) && k71.k.b(this.a, ((y4) obj).a);
    }

    public final int hashCode() {
        w4 w4Var = this.a;
        if (w4Var == null) {
            return 0;
        }
        return w4Var.hashCode();
    }

    public final String toString() {
        return "Data(closeIssue=" + this.a + ")";
    }
}
