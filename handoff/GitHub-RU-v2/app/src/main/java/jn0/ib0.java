package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ib0 implements aaShadow.m0 {
    public jb0 a;

    public ib0(jb0 jb0Var) {
        this.a = jb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib0) && k71.k.b(this.a, ((ib0) obj).a);
    }

    public final int hashCode() {
        jb0 jb0Var = this.a;
        if (jb0Var == null) {
            return 0;
        }
        return jb0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardPins=" + this.a + ")";
    }
}
