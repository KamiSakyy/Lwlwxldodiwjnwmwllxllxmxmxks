package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e40 implements aa.m0 {
    public final g40 a;

    public e40(g40 g40Var) {
        this.a = g40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e40) && k71.k.b(this.a, ((e40) obj).a);
    }

    public final int hashCode() {
        g40 g40Var = this.a;
        if (g40Var == null) {
            return 0;
        }
        return g40Var.hashCode();
    }

    public final String toString() {
        return "Data(setLabelsForLabelable=" + this.a + ")";
    }
}
