package f00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public final String a;
    public final v0 b;

    public t0(String str, v0 v0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v0 v0Var = this.b;
        return hashCode + (v0Var == null ? 0 : v0Var.hashCode());
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
