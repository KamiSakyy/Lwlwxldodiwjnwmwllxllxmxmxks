package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ke0 {
    public pz0.i90 a;
    public boolean b;

    public ke0(pz0.i90 i90Var, boolean z) {
        this.a = i90Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke0)) {
            return false;
        }
        ke0 ke0Var = (ke0) obj;
        return this.a == ke0Var.a && this.b == ke0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
}
