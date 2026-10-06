package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p4 {
    public String a;
    public t4 b;
    public r4 c;

    public p4(String str, t4 t4Var, r4 r4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = t4Var;
        this.c = r4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.a, p4Var.a) && k71.k.b(this.b, p4Var.b) && k71.k.b(this.c, p4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t4 t4Var = this.b;
        int hashCode2 = (hashCode + (t4Var == null ? 0 : t4Var.hashCode())) * 31;
        r4 r4Var = this.c;
        return hashCode2 + (r4Var != null ? r4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
