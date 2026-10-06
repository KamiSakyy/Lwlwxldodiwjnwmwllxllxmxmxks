package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l90 implements aaShadow.v0 {
    public final n90 a;
    public final m90 b;

    public l90(n90 n90Var, m90 m90Var) {
        this.a = n90Var;
        this.b = m90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        return k71.k.b(this.a, l90Var.a) && k71.k.b(this.b, l90Var.b);
    }

    public final int hashCode() {
        n90 n90Var = this.a;
        int hashCode = (n90Var == null ? 0 : n90Var.hashCode()) * 31;
        m90 m90Var = this.b;
        return hashCode + (m90Var != null ? m90Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(user=" + this.a + ", organization=" + this.b + ")";
    }
}
