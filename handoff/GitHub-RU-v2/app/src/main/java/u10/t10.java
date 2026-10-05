package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t10 implements aa.m0 {
    public final u10 a;

    public t10(u10 u10Var) {
        this.a = u10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t10) && k71.k.b(this.a, ((t10) obj).a);
    }

    public final int hashCode() {
        u10 u10Var = this.a;
        if (u10Var == null) {
            return 0;
        }
        return u10Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUser=" + this.a + ")";
    }
}
