package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 {
    public final String a;
    public final k5 b;
    public final j5 c;

    public h5(String str, k5 k5Var, j5 j5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k5Var;
        this.c = j5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return k71.k.b(this.a, h5Var.a) && k71.k.b(this.b, h5Var.b) && k71.k.b(this.c, h5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k5 k5Var = this.b;
        int hashCode2 = (hashCode + (k5Var == null ? 0 : k5Var.hashCode())) * 31;
        j5 j5Var = this.c;
        return hashCode2 + (j5Var != null ? j5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node6(__typename=" + this.a + ", onStatusContext=" + this.b + ", onCheckRun=" + this.c + ")";
    }
}
