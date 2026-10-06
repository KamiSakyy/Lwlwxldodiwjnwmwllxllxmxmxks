package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m20 implements aaShadow.v0 {
    public q20 a;
    public String b;
    public String c;

    public m20(q20 q20Var, String str, String str2) {
        this.a = q20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m20)) {
            return false;
        }
        m20 m20Var = (m20) obj;
        return k71.k.b(this.a, m20Var.a) && k71.k.b(this.b, m20Var.b) && k71.k.b(this.c, m20Var.c);
    }

    public final int hashCode() {
        q20 q20Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((q20Var == null ? 0 : q20Var.hashCode()) * 31, this.b, 31);
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
