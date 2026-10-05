package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 implements aa.v0 {
    public final f6 a;
    public final String b;
    public final String c;

    public a6(f6 f6Var, String str, String str2) {
        this.a = f6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && k71.k.b(this.b, a6Var.b) && k71.k.b(this.c, a6Var.c);
    }

    public final int hashCode() {
        f6 f6Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((f6Var == null ? 0 : f6Var.hashCode()) * 31, this.b, 31);
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
