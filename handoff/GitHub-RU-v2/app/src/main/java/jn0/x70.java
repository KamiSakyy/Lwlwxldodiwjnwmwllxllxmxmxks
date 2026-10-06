package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x70 implements aaShadow.m0 {
    public final y70 a;

    public x70(y70 y70Var) {
        this.a = y70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x70) && k71.k.b(this.a, ((x70) obj).a);
    }

    public final int hashCode() {
        y70 y70Var = this.a;
        if (y70Var == null) {
            return 0;
        }
        return y70Var.hashCode();
    }

    public final String toString() {
        return "Data(unfollowUser=" + this.a + ")";
    }
}
