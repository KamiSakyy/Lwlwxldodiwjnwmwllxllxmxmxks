package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ca0 implements aaShadow.m0 {
    public ea0 a;

    public ca0(ea0 ea0Var) {
        this.a = ea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca0) && k71.k.b(this.a, ((ca0) obj).a);
    }

    public final int hashCode() {
        ea0 ea0Var = this.a;
        if (ea0Var == null) {
            return 0;
        }
        return ea0Var.hashCode();
    }

    public final String toString() {
        return "Data(setDashboardFeedFilters=" + this.a + ")";
    }
}
