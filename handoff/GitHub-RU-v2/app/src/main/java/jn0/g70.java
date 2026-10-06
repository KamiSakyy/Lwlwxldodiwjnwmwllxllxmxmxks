package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g70 implements aaShadow.m0 {
    public h70 a;

    public g70(h70 h70Var) {
        this.a = h70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g70) && k71.k.b(this.a, ((g70) obj).a);
    }

    public final int hashCode() {
        h70 h70Var = this.a;
        if (h70Var == null) {
            return 0;
        }
        return h70Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUserFromOrganization=" + this.a + ")";
    }
}
