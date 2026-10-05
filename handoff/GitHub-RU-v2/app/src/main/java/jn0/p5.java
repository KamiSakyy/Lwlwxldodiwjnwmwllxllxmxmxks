package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p5 implements aa.v0 {
    public final r5 a;
    public final String b;
    public final String c;

    public p5(r5 r5Var, String str, String str2) {
        this.a = r5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return k71.k.b(this.a, p5Var.a) && k71.k.b(this.b, p5Var.b) && k71.k.b(this.c, p5Var.c);
    }

    public final int hashCode() {
        r5 r5Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((r5Var == null ? 0 : r5Var.hashCode()) * 31, this.b, 31);
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
