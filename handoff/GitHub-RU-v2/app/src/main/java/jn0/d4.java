package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 implements aa.v0 {
    public final h4 a;
    public final String b;
    public final String c;

    public d4(h4 h4Var, String str, String str2) {
        this.a = h4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return k71.k.b(this.a, d4Var.a) && k71.k.b(this.b, d4Var.b) && k71.k.b(this.c, d4Var.c);
    }

    public final int hashCode() {
        h4 h4Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((h4Var == null ? 0 : h4Var.hashCode()) * 31, this.b, 31);
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
