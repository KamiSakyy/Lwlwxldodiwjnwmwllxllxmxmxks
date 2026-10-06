package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j80 implements aaShadow.m0 {
    public final l80 a;

    public j80(l80 l80Var) {
        this.a = l80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j80) && k71.k.b(this.a, ((j80) obj).a);
    }

    public final int hashCode() {
        l80 l80Var = this.a;
        if (l80Var == null) {
            return 0;
        }
        return l80Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardNavLinks=" + this.a + ")";
    }
}
