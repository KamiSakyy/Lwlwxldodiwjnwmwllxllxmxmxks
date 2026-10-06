package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f80 {
    public final g80 a;

    public f80(g80 g80Var) {
        this.a = g80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f80) && k71.k.b(this.a, ((f80) obj).a);
    }

    public final int hashCode() {
        g80 g80Var = this.a;
        if (g80Var == null) {
            return 0;
        }
        return g80Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserMobileTimeZone(user=" + this.a + ")";
    }
}
