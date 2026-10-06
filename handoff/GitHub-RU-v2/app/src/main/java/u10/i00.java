package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i00 implements aaShadow.m0 {
    public l00 a;
    public j00 b;

    public i00(l00 l00Var, j00 j00Var) {
        this.a = l00Var;
        this.b = j00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        return k71.k.b(this.a, i00Var.a) && k71.k.b(this.b, i00Var.b);
    }

    public final int hashCode() {
        l00 l00Var = this.a;
        int hashCode = (l00Var == null ? 0 : l00Var.hashCode()) * 31;
        j00 j00Var = this.b;
        return hashCode + (j00Var != null ? j00Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ", markNotificationAsUndone=" + this.b + ")";
    }
}
