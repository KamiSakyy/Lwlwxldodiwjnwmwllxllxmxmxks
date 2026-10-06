package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 {
    public String a;
    public x4 b;
    public w4 c;

    public u4(String str, x4 x4Var, w4 w4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = x4Var;
        this.c = w4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return k71.k.b(this.a, u4Var.a) && k71.k.b(this.b, u4Var.b) && k71.k.b(this.c, u4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x4 x4Var = this.b;
        int hashCode2 = (hashCode + (x4Var == null ? 0 : x4Var.hashCode())) * 31;
        w4 w4Var = this.c;
        return hashCode2 + (w4Var != null ? w4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node6(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
