package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ka0 {
    public final gn0.e10 a;
    public final boolean b;

    public ka0(gn0.e10 e10Var, boolean z) {
        this.a = e10Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return this.a == ka0Var.a && this.b == ka0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
}
