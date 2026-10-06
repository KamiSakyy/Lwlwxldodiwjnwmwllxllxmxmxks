package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a8 implements aaShadow.m0 {
    public final y7 a;

    public a8(y7 y7Var) {
        this.a = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8) && k71.k.b(this.a, ((a8) obj).a);
    }

    public final int hashCode() {
        y7 y7Var = this.a;
        if (y7Var == null) {
            return 0;
        }
        return y7Var.hashCode();
    }

    public final String toString() {
        return "Data(createDashboardSearchShortcut=" + this.a + ")";
    }
}
