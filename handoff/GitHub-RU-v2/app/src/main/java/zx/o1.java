package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.v0 {
    public p1 a;
    public String b;
    public String c;

    public o1(p1 p1Var, String str, String str2) {
        this.a = p1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b) && k71.k.b(this.c, o1Var.c);
    }

    public final int hashCode() {
        p1 p1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p1Var == null ? 0 : p1Var.hashCode()) * 31, this.b, 31);
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
