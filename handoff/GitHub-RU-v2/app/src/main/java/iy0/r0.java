package iy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 {
    public final String a;
    public final t0 b;

    public r0(String str, t0 t0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t0 t0Var = this.b;
        return hashCode + (t0Var == null ? 0 : t0Var.hashCode());
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
