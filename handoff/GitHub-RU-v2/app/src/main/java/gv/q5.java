package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q5 {
    public String a;
    public u5 b;
    public t5 c;

    public q5(String str, u5 u5Var, t5 t5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u5Var;
        this.c = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return k71.k.b(this.a, q5Var.a) && k71.k.b(this.b, q5Var.b) && k71.k.b(this.c, q5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u5 u5Var = this.b;
        int hashCode2 = (hashCode + (u5Var == null ? 0 : u5Var.hashCode())) * 31;
        t5 t5Var = this.c;
        return hashCode2 + (t5Var != null ? t5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node6(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
