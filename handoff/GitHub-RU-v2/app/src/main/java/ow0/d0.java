package ow0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 {
    public final String a;
    public final h0 b;
    public final f0 c;

    public d0(String str, h0 h0Var, f0 f0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = h0Var;
        this.c = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(this.a, d0Var.a) && k71.k.b(this.b, d0Var.b) && k71.k.b(this.c, d0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h0 h0Var = this.b;
        int hashCode2 = (hashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        f0 f0Var = this.c;
        return hashCode2 + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
