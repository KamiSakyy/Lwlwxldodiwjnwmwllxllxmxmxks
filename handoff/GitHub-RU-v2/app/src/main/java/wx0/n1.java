package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 {
    public w1 a;
    public xShadow b;

    public n1(w1 w1Var, xShadow xVar) {
        this.a = w1Var;
        this.b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b);
    }

    public final int hashCode() {
        w1 w1Var = this.a;
        return this.b.hashCode() + ((w1Var == null ? 0 : w1Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldUserValue(users=" + this.a + ", field=" + this.b + ")";
    }
}
