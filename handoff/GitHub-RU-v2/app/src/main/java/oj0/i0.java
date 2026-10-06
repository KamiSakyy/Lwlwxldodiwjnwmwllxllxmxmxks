package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public String a;
    public String b;
    public g0 c;

    public i0(String str, String str2, g0 g0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        g0 g0Var = this.c;
        return i + (g0Var == null ? 0 : g0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
