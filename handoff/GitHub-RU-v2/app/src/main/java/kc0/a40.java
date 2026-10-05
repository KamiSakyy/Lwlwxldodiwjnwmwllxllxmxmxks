package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a40 implements aa.m0 {
    public final b40 a;

    public a40(b40 b40Var) {
        this.a = b40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a40) && k71.k.b(this.a, ((a40) obj).a);
    }

    public final int hashCode() {
        b40 b40Var = this.a;
        if (b40Var == null) {
            return 0;
        }
        return b40Var.hashCode();
    }

    public final String toString() {
        return "Data(unfollowUser=" + this.a + ")";
    }
}
