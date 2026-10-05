package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h8 implements aa.m0 {
    public final g8 a;

    public h8(g8 g8Var) {
        this.a = g8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8) && k71.k.b(this.a, ((h8) obj).a);
    }

    public final int hashCode() {
        g8 g8Var = this.a;
        if (g8Var == null) {
            return 0;
        }
        return g8Var.hashCode();
    }

    public final String toString() {
        return "Data(createUserDisinterest=" + this.a + ")";
    }
}
