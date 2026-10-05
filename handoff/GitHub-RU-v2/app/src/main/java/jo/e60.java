package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e60 implements aa.m0 {
    public final g60 a;

    public e60(g60 g60Var) {
        this.a = g60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e60) && k71.k.b(this.a, ((e60) obj).a);
    }

    public final int hashCode() {
        g60 g60Var = this.a;
        if (g60Var == null) {
            return 0;
        }
        return g60Var.hashCode();
    }

    public final String toString() {
        return "Data(setLabelsForLabelable=" + this.a + ")";
    }
}
