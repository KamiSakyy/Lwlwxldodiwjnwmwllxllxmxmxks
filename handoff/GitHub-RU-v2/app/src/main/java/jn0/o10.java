package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o10 implements aa.v0 {
    public final p10 a;
    public final String b;
    public final String c;

    public o10(p10 p10Var, String str, String str2) {
        this.a = p10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return k71.k.b(this.a, o10Var.a) && k71.k.b(this.b, o10Var.b) && k71.k.b(this.c, o10Var.c);
    }

    public final int hashCode() {
        p10 p10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p10Var == null ? 0 : p10Var.hashCode()) * 31, this.b, 31);
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
