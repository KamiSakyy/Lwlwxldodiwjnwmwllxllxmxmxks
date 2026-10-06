package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x10 implements aaShadow.m0 {
    public y10 a;

    public x10(y10 y10Var) {
        this.a = y10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x10) && k71.k.b(this.a, ((x10) obj).a);
    }

    public final int hashCode() {
        y10 y10Var = this.a;
        if (y10Var == null) {
            return 0;
        }
        return y10Var.hashCode();
    }

    public final String toString() {
        return "Data(resolveReviewThread=" + this.a + ")";
    }
}
