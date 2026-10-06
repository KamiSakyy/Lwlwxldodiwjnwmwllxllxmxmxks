package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public String a;
    public String b;
    public h0 c;

    public g0(String str, String str2, h0 h0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        h0 h0Var = this.c;
        return i + (h0Var == null ? 0 : h0Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", login=", this.b, ", onNode=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
