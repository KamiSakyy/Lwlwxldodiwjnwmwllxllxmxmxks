package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h50 {
    public final i50 a;

    public h50(i50 i50Var) {
        this.a = i50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h50) && k71.k.b(this.a, ((h50) obj).a);
    }

    public final int hashCode() {
        i50 i50Var = this.a;
        if (i50Var == null) {
            return 0;
        }
        return i50Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserDashboardPins(user=" + this.a + ")";
    }
    public Object a = null;
}
