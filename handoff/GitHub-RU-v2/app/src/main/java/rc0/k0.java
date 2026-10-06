package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 {
    public String a;
    public String b;
    public l0 c;

    public k0(String str, String str2, l0 l0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b) && k71.k.b(this.c, k0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        l0 l0Var = this.c;
        return i + (l0Var == null ? 0 : l0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
