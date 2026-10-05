package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k10 implements aa.m0 {
    public final m10 a;

    public k10(m10 m10Var) {
        this.a = m10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k10) && k71.k.b(this.a, ((k10) obj).a);
    }

    public final int hashCode() {
        m10 m10Var = this.a;
        if (m10Var == null) {
            return 0;
        }
        return m10Var.hashCode();
    }

    public final String toString() {
        return "Data(unresolveReviewThread=" + this.a + ")";
    }
}
