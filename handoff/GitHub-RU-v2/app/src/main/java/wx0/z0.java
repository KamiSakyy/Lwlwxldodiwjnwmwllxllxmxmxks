package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public final String a;
    public final q0 b;

    public z0(String str, q0 q0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q0 q0Var = this.b;
        return hashCode + (q0Var == null ? 0 : q0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration6(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
