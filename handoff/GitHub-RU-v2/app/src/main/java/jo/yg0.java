package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yg0 {
    public final m10.dg0 a;
    public final boolean b;

    public yg0(m10.dg0 dg0Var, boolean z) {
        this.a = dg0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg0)) {
            return false;
        }
        yg0 yg0Var = (yg0) obj;
        return this.a == yg0Var.a && this.b == yg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
}
