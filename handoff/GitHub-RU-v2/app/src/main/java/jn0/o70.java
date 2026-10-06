package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o70 implements aaShadow.m0 {
    public p70 a;

    public o70(p70 p70Var) {
        this.a = p70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && k71.k.b(this.a, ((o70) obj).a);
    }

    public final int hashCode() {
        p70 p70Var = this.a;
        if (p70Var == null) {
            return 0;
        }
        return p70Var.hashCode();
    }

    public final String toString() {
        return "Data(undoUserDisinterest=" + this.a + ")";
    }
}
