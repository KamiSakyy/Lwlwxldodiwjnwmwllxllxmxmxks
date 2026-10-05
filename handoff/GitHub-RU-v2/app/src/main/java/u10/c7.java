package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c7 implements aa.m0 {
    public final a7 a;

    public c7(a7 a7Var) {
        this.a = a7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7) && k71.k.b(this.a, ((c7) obj).a);
    }

    public final int hashCode() {
        a7 a7Var = this.a;
        if (a7Var == null) {
            return 0;
        }
        return a7Var.hashCode();
    }

    public final String toString() {
        return "Data(createDashboardSearchShortcut=" + this.a + ")";
    }
}
