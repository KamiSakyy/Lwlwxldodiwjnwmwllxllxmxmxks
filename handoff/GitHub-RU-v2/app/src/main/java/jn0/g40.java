package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g40 {
    public f40 a;

    public g40(f40 f40Var) {
        this.a = f40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g40) && k71.k.b(this.a, ((g40) obj).a);
    }

    public final int hashCode() {
        f40 f40Var = this.a;
        if (f40Var == null) {
            return 0;
        }
        return f40Var.hashCode();
    }

    public final String toString() {
        return "SetLabelsForLabelable(labelableRecord=" + this.a + ")";
    }
}
