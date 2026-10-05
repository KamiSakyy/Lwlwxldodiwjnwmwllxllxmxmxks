package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m4 implements aa.v0 {
    public final q4 a;
    public final String b;
    public final String c;

    public m4(q4 q4Var, String str, String str2) {
        this.a = q4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return k71.k.b(this.a, m4Var.a) && k71.k.b(this.b, m4Var.b) && k71.k.b(this.c, m4Var.c);
    }

    public final int hashCode() {
        q4 q4Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((q4Var == null ? 0 : q4Var.hashCode()) * 31, this.b, 31);
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
