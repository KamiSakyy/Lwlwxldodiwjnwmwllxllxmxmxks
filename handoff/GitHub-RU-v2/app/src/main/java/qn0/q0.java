package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements aa.v0 {
    public final r0 a;
    public final String b;
    public final String c;

    public q0(r0 r0Var, String str, String str2) {
        this.a = r0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && k71.k.b(this.c, q0Var.c);
    }

    public final int hashCode() {
        r0 r0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((r0Var == null ? 0 : r0Var.hashCode()) * 31, this.b, 31);
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
