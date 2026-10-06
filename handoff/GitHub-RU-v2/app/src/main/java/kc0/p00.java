package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p00 implements aaShadow.m0 {
    public r00 a;

    public p00(r00 r00Var) {
        this.a = r00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p00) && k71.k.b(this.a, ((p00) obj).a);
    }

    public final int hashCode() {
        r00 r00Var = this.a;
        if (r00Var == null) {
            return 0;
        }
        return r00Var.hashCode();
    }

    public final String toString() {
        return "Data(setLabelsForLabelable=" + this.a + ")";
    }
}
