package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 implements aa.v0 {
    public r1 a;
    public String b;
    public String c;

    public q1(r1 r1Var, String str, String str2) {
        this.a = r1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return k71.k.b(this.a, q1Var.a) && k71.k.b(this.b, q1Var.b) && k71.k.b(this.c, q1Var.c);
    }

    public final int hashCode() {
        r1 r1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((r1Var == null ? 0 : r1Var.hashCode()) * 31, this.b, 31);
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
