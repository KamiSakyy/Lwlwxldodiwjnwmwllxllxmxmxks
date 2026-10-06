package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u40 {
    public final l40 a;
    public final p40 b;

    public u40(l40 l40Var, p40 p40Var) {
        this.a = l40Var;
        this.b = p40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return k71.k.b(this.a, u40Var.a) && k71.k.b(this.b, u40Var.b);
    }

    public final int hashCode() {
        l40 l40Var = this.a;
        int hashCode = (l40Var == null ? 0 : l40Var.hashCode()) * 31;
        p40 p40Var = this.b;
        return hashCode + (p40Var != null ? p40Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateIssue(actor=" + this.a + ", issue=" + this.b + ")";
    }
}
