package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z70 implements aa.m0 {
    public final b80 a;

    public z70(b80 b80Var) {
        this.a = b80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z70) && k71.k.b(this.a, ((z70) obj).a);
    }

    public final int hashCode() {
        b80 b80Var = this.a;
        if (b80Var == null) {
            return 0;
        }
        return b80Var.hashCode();
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ")";
    }






































































}
