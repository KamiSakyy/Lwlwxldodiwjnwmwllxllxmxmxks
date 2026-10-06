package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class za0 implements aaShadow.m0 {
    public final bb0 a;

    public za0(bb0 bb0Var) {
        this.a = bb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za0) && k71.k.b(this.a, ((za0) obj).a);
    }

    public final int hashCode() {
        bb0 bb0Var = this.a;
        if (bb0Var == null) {
            return 0;
        }
        return bb0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
