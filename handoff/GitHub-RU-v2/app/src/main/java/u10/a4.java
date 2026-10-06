package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 {
    public String a;
    public e4 b;
    public c4 c;

    public a4(String str, e4 e4Var, c4 c4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e4Var;
        this.c = c4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && k71.k.b(this.b, a4Var.b) && k71.k.b(this.c, a4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e4 e4Var = this.b;
        int hashCode2 = (hashCode + (e4Var == null ? 0 : e4Var.hashCode())) * 31;
        c4 c4Var = this.c;
        return hashCode2 + (c4Var != null ? c4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
