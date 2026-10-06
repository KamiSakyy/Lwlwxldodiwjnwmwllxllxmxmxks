package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public String a;
    public t0 b;

    public c1(String str, t0 t0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && k71.k.b(this.b, c1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t0 t0Var = this.b;
        return hashCode + (t0Var == null ? 0 : t0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration8(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
