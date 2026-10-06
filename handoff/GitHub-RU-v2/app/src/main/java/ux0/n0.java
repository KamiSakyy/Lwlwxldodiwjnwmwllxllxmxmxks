package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 {
    public final String a;
    public final String b;
    public final m0 c;

    public n0(String str, String str2, m0 m0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b) && k71.k.b(this.c, n0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        m0 m0Var = this.c;
        return i + (m0Var == null ? 0 : m0Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", onProjectV2Owner=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
