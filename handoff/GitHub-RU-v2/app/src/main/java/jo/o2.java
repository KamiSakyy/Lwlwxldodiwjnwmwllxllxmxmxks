package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 implements aaShadow.m0 {
    public m2 a;

    public o2(m2 m2Var) {
        this.a = m2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && k71.k.b(this.a, ((o2) obj).a);
    }

    public final int hashCode() {
        m2 m2Var = this.a;
        if (m2Var == null) {
            return 0;
        }
        return m2Var.a.hashCode();
    }

    public final String toString() {
        return "Data(applyMobileSuggestedChanges=" + this.a + ")";
    }
}
