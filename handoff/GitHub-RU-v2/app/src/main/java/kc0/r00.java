package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r00 {
    public q00 a;

    public r00(q00 q00Var) {
        this.a = q00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r00) && k71.k.b(this.a, ((r00) obj).a);
    }

    public final int hashCode() {
        q00 q00Var = this.a;
        if (q00Var == null) {
            return 0;
        }
        return q00Var.hashCode();
    }

    public final String toString() {
        return "SetLabelsForLabelable(labelableRecord=" + this.a + ")";
    }
}
