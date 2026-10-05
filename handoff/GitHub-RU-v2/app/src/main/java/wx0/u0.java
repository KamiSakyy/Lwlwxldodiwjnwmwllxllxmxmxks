package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 {
    public final String a;
    public final l0 b;

    public u0(String str, l0 l0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && k71.k.b(this.b, u0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l0 l0Var = this.b;
        return hashCode + (l0Var == null ? 0 : l0Var.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration1(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
