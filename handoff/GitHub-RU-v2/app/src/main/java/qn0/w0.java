package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 implements aa.v0 {
    public final a1 a;
    public final String b;
    public final String c;

    public w0(a1 a1Var, String str, String str2) {
        this.a = a1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b) && k71.k.b(this.c, w0Var.c);
    }

    public final int hashCode() {
        a1 a1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((a1Var == null ? 0 : a1Var.hashCode()) * 31, this.b, 31);
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
