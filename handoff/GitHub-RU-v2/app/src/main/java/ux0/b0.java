package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 implements aa.v0 {
    public final g0 a;
    public final String b;
    public final String c;

    public b0(g0 g0Var, String str, String str2) {
        this.a = g0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c);
    }

    public final int hashCode() {
        g0 g0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((g0Var == null ? 0 : g0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
