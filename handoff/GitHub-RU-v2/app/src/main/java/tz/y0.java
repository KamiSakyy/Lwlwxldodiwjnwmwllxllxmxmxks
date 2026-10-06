package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public final String a;
    public final p0 b;

    public y0(String str, p0 p0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p0 p0Var = this.b;
        return hashCode + (p0Var == null ? 0 : p0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration4(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
