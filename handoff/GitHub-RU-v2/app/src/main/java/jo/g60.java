package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g60 {
    public f60 a;

    public g60(f60 f60Var) {
        this.a = f60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g60) && k71.k.b(this.a, ((g60) obj).a);
    }

    public final int hashCode() {
        f60 f60Var = this.a;
        if (f60Var == null) {
            return 0;
        }
        return f60Var.hashCode();
    }

    public final String toString() {
        return "SetLabelsForLabelable(labelableRecord=" + this.a + ")";
    }
}
