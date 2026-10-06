package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 {
    public String a;
    public s0 b;

    public b1(String str, s0 s0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.a, b1Var.a) && k71.k.b(this.b, b1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s0 s0Var = this.b;
        return hashCode + (s0Var == null ? 0 : s0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration7(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
