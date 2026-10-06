package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w2 implements aa.v0 {
    public x2 a;
    public String b;
    public String c;

    public w2(x2 x2Var, String str, String str2) {
        this.a = x2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return k71.k.b(this.a, w2Var.a) && k71.k.b(this.b, w2Var.b) && k71.k.b(this.c, w2Var.c);
    }

    public final int hashCode() {
        x2 x2Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((x2Var == null ? 0 : x2Var.hashCode()) * 31, this.b, 31);
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
