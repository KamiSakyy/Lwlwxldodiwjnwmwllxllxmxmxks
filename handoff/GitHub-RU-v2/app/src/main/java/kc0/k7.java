package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k7 implements aaShadow.m0 {
    public final i7 a;

    public k7(i7 i7Var) {
        this.a = i7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7) && k71.k.b(this.a, ((k7) obj).a);
    }

    public final int hashCode() {
        i7 i7Var = this.a;
        if (i7Var == null) {
            return 0;
        }
        return i7Var.hashCode();
    }

    public final String toString() {
        return "Data(createDashboardSearchShortcut=" + this.a + ")";
    }
}
