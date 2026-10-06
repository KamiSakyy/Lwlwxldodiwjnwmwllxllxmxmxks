package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 {
    public final c0 a;
    public final v b;

    public f1(c0 c0Var, v vVar) {
        this.a = c0Var;
        this.b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b);
    }

    public final int hashCode() {
        c0 c0Var = this.a;
        return this.b.hashCode() + ((c0Var == null ? 0 : c0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldLabelValue(labels=" + this.a + ", field=" + this.b + ")";
    }
}
