package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j40 implements aaShadow.m0 {
    public final k40 a;

    public j40(k40 k40Var) {
        this.a = k40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j40) && k71.k.b(this.a, ((j40) obj).a);
    }

    public final int hashCode() {
        k40 k40Var = this.a;
        if (k40Var == null) {
            return 0;
        }
        return k40Var.hashCode();
    }

    public final String toString() {
        return "Data(setDashboardSearchShortcuts=" + this.a + ")";
    }
}
