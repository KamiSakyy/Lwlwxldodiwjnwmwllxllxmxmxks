package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p2 implements aaShadow.v0 {
    public final x2 a;
    public final r2 b;

    public p2(x2 x2Var, r2 r2Var) {
        this.a = x2Var;
        this.b = r2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.a, p2Var.a) && k71.k.b(this.b, p2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r2 r2Var = this.b;
        return hashCode + (r2Var == null ? 0 : r2Var.hashCode());
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ", node=" + this.b + ")";
    }
}
