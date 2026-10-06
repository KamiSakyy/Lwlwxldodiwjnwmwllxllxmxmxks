package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p00 implements aaShadow.v0 {
    public y00 a;

    public p00(y00 y00Var) {
        this.a = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p00) && k71.k.b(this.a, ((p00) obj).a);
    }

    public final int hashCode() {
        y00 y00Var = this.a;
        if (y00Var == null) {
            return 0;
        }
        return y00Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
