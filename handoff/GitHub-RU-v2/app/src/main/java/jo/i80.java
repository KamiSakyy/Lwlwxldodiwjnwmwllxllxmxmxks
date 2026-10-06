package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i80 implements aaShadow.m0 {
    public l80 a;
    public j80 b;

    public i80(l80 l80Var, j80 j80Var) {
        this.a = l80Var;
        this.b = j80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i80)) {
            return false;
        }
        i80 i80Var = (i80) obj;
        return k71.k.b(this.a, i80Var.a) && k71.k.b(this.b, i80Var.b);
    }

    public final int hashCode() {
        l80 l80Var = this.a;
        int hashCode = (l80Var == null ? 0 : l80Var.hashCode()) * 31;
        j80 j80Var = this.b;
        return hashCode + (j80Var != null ? j80Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsUndone=" + this.b + ")";
    }
}
