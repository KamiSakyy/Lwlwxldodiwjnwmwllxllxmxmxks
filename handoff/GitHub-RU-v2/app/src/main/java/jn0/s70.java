package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s70 implements aa.m0 {
    public final t70 a;

    public s70(t70 t70Var) {
        this.a = t70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s70) && k71.k.b(this.a, ((s70) obj).a);
    }

    public final int hashCode() {
        t70 t70Var = this.a;
        if (t70Var == null) {
            return 0;
        }
        return t70Var.hashCode();
    }

    public final String toString() {
        return "Data(unfollowUser=" + this.a + ")";
    }
}
