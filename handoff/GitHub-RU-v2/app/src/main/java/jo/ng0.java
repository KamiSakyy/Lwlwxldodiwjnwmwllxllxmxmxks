package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ng0 implements aa.m0 {
    public final pg0 a;

    public ng0(pg0 pg0Var) {
        this.a = pg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng0) && k71.k.b(this.a, ((ng0) obj).a);
    }

    public final int hashCode() {
        pg0 pg0Var = this.a;
        if (pg0Var == null) {
            return 0;
        }
        return pg0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ")";
    }
}
