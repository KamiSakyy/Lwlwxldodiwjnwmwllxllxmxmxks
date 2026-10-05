package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aa.v0 {
    public final m2 a;
    public final String b;
    public final String c;

    public l2(m2 m2Var, String str, String str2) {
        this.a = m2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return k71.k.b(this.a, l2Var.a) && k71.k.b(this.b, l2Var.b) && k71.k.b(this.c, l2Var.c);
    }

    public final int hashCode() {
        m2 m2Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((m2Var == null ? 0 : m2Var.hashCode()) * 31, this.b, 31);
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
