package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u00 implements aaShadow.m0 {
    public v00 a;

    public u00(v00 v00Var) {
        this.a = v00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u00) && k71.k.b(this.a, ((u00) obj).a);
    }

    public final int hashCode() {
        v00 v00Var = this.a;
        if (v00Var == null) {
            return 0;
        }
        return v00Var.hashCode();
    }

    public final String toString() {
        return "Data(setDashboardSearchShortcuts=" + this.a + ")";
    }
}
