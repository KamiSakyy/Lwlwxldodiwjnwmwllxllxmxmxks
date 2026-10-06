package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s60 {
    public final j60 a;
    public final n60 b;

    public s60(j60 j60Var, n60 n60Var) {
        this.a = j60Var;
        this.b = n60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s60)) {
            return false;
        }
        s60 s60Var = (s60) obj;
        return k71.k.b(this.a, s60Var.a) && k71.k.b(this.b, s60Var.b);
    }

    public final int hashCode() {
        j60 j60Var = this.a;
        int hashCode = (j60Var == null ? 0 : j60Var.hashCode()) * 31;
        n60 n60Var = this.b;
        return hashCode + (n60Var != null ? n60Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateIssue(actor=" + this.a + ", issue=" + this.b + ")";
    }
}
