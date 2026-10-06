package dl0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z {
    public String a;
    public d0 b;
    public b0 c;

    public z(String str, d0 d0Var, b0 b0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = d0Var;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d0 d0Var = this.b;
        int hashCode2 = (hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        b0 b0Var = this.c;
        return hashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
