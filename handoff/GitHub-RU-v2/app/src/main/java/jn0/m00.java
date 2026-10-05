package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m00 implements aa.v0 {
    public final q00 a;
    public final String b;
    public final String c;

    public m00(q00 q00Var, String str, String str2) {
        this.a = q00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return k71.k.b(this.a, m00Var.a) && k71.k.b(this.b, m00Var.b) && k71.k.b(this.c, m00Var.c);
    }

    public final int hashCode() {
        q00 q00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((q00Var == null ? 0 : q00Var.hashCode()) * 31, this.b, 31);
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
