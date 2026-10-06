package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 {
    public final l1 a;
    public final n1 b;
    public final m1 c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.a = l1Var;
        this.b = n1Var;
        this.c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.a.equals(k1Var.a) && this.b.equals(k1Var.b) && this.c.equals(k1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
