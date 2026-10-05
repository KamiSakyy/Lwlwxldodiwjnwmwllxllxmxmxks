package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k70 implements aa.m0 {
    public final l70 a;

    public k70(l70 l70Var) {
        this.a = l70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k70) && k71.k.b(this.a, ((k70) obj).a);
    }

    public final int hashCode() {
        l70 l70Var = this.a;
        if (l70Var == null) {
            return 0;
        }
        return l70Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUser=" + this.a + ")";
    }
}
