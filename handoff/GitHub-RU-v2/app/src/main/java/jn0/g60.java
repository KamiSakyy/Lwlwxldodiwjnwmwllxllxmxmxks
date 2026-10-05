package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g60 implements aa.v0 {
    public final p60 a;
    public final String b;
    public final String c;

    public g60(p60 p60Var, String str, String str2) {
        this.a = p60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g60)) {
            return false;
        }
        g60 g60Var = (g60) obj;
        return k71.k.b(this.a, g60Var.a) && k71.k.b(this.b, g60Var.b) && k71.k.b(this.c, g60Var.c);
    }

    public final int hashCode() {
        p60 p60Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p60Var == null ? 0 : p60Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
