package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public String a;
    public m0 b;

    public v0(String str, m0 m0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m0 m0Var = this.b;
        return hashCode + (m0Var == null ? 0 : m0Var.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration1(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
