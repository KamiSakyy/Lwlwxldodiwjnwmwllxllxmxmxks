package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 {
    public final String a;
    public final n0 b;

    public w0(String str, n0 n0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n0 n0Var = this.b;
        return hashCode + (n0Var == null ? 0 : n0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration3(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
