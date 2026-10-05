package ly;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public final c0 a;
    public final g0 b;

    public f0(c0 c0Var, g0 g0Var) {
        this.a = c0Var;
        this.b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b);
    }

    public final int hashCode() {
        c0 c0Var = this.a;
        int hashCode = (c0Var == null ? 0 : c0Var.hashCode()) * 31;
        g0 g0Var = this.b;
        return hashCode + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateUserListsForItem(item=" + this.a + ", user=" + this.b + ")";
    }
}
