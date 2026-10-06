package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e70 implements aaShadow.m0 {
    public final f70 a;

    public e70(f70 f70Var) {
        this.a = f70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e70) && k71.k.b(this.a, ((e70) obj).a);
    }

    public final int hashCode() {
        f70 f70Var = this.a;
        if (f70Var == null) {
            return 0;
        }
        return f70Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardPins=" + this.a + ")";
    }
}
