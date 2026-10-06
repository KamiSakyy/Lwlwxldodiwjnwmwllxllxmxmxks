package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 {
    public final String a;
    public final o0 b;

    public x0(String str, o0 o0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o0 o0Var = this.b;
        return hashCode + (o0Var == null ? 0 : o0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration4(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
