package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 {
    public String a;
    public k4 b;
    public i4 c;

    public g4(String str, k4 k4Var, i4 i4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k4Var;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return k71.k.b(this.a, g4Var.a) && k71.k.b(this.b, g4Var.b) && k71.k.b(this.c, g4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k4 k4Var = this.b;
        int hashCode2 = (hashCode + (k4Var == null ? 0 : k4Var.hashCode())) * 31;
        i4 i4Var = this.c;
        return hashCode2 + (i4Var != null ? i4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node3(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
