package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements aaShadow.m0 {
    public d0 a;

    public e0(d0 d0Var) {
        this.a = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && k71.k.b(this.a, ((e0) obj).a);
    }

    public final int hashCode() {
        d0 d0Var = this.a;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.hashCode();
    }

    public final String toString() {
        return "Data(createUserDashboardPin=" + this.a + ")";
    }
}
