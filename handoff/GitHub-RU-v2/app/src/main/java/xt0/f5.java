package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f5 {
    public final String a;
    public final i5 b;
    public final h5 c;

    public f5(String str, i5 i5Var, h5 h5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = i5Var;
        this.c = h5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return k71.k.b(this.a, f5Var.a) && k71.k.b(this.b, f5Var.b) && k71.k.b(this.c, f5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i5 i5Var = this.b;
        int hashCode2 = (hashCode + (i5Var == null ? 0 : i5Var.hashCode())) * 31;
        h5 h5Var = this.c;
        return hashCode2 + (h5Var != null ? h5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node5(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
