package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 {
    public final String a;
    public final String b;
    public final g1 c;

    public i1(String str, String str2, g1 g1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b) && k71.k.b(this.c, i1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        g1 g1Var = this.c;
        return i + (g1Var == null ? 0 : g1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
