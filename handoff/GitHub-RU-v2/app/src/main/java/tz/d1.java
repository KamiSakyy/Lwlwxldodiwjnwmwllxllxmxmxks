package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public String a;
    public u0 b;

    public d1(String str, u0 u0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u0 u0Var = this.b;
        return hashCode + (u0Var == null ? 0 : u0Var.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
