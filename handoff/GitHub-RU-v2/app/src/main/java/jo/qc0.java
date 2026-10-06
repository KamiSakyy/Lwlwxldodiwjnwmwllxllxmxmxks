package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qc0 implements aaShadow.m0 {
    public final sc0 a;

    public qc0(sc0 sc0Var) {
        this.a = sc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc0) && k71.k.b(this.a, ((qc0) obj).a);
    }

    public final int hashCode() {
        sc0 sc0Var = this.a;
        if (sc0Var == null) {
            return 0;
        }
        return sc0Var.hashCode();
    }

    public final String toString() {
        return "Data(setDashboardFeedFilters=" + this.a + ")";
    }
}
