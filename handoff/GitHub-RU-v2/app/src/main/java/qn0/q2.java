package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q2 implements aa.v0 {
    public final r2 a;
    public final String b;
    public final String c;

    public q2(r2 r2Var, String str, String str2) {
        this.a = r2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return k71.k.b(this.a, q2Var.a) && k71.k.b(this.b, q2Var.b) && k71.k.b(this.c, q2Var.c);
    }

    public final int hashCode() {
        r2 r2Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((r2Var == null ? 0 : r2Var.hashCode()) * 31, this.b, 31);
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
