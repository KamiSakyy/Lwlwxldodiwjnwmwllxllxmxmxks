package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t4 implements aa.m0 {
    public final r4 a;

    public t4(r4 r4Var) {
        this.a = r4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4) && k71.k.b(this.a, ((t4) obj).a);
    }

    public final int hashCode() {
        r4 r4Var = this.a;
        if (r4Var == null) {
            return 0;
        }
        return r4Var.hashCode();
    }

    public final String toString() {
        return "Data(cloneTemplateRepository=" + this.a + ")";
    }
}
