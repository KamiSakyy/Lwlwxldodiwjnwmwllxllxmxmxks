package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ud0 implements aaShadow.m0 {
    public wd0 a;

    public ud0(wd0 wd0Var) {
        this.a = wd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud0) && k71.k.b(this.a, ((ud0) obj).a);
    }

    public final int hashCode() {
        wd0 wd0Var = this.a;
        if (wd0Var == null) {
            return 0;
        }
        return wd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDashboardSearchShortcut=" + this.a + ")";
    }
}
