package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;
    public final w0 b;
    public final u0 c;

    public s0(String str, w0 w0Var, u0 u0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = w0Var;
        this.c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w0 w0Var = this.b;
        int hashCode2 = (hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        u0 u0Var = this.c;
        return hashCode2 + (u0Var != null ? u0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
