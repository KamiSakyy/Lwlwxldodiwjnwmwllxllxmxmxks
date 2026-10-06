package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m00 {
    public String a;
    public k00 b;
    public String c;

    public m00(String str, k00 k00Var, String str2) {
        this.a = str;
        this.b = k00Var;
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
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Compare(id=");
        sb.append(this.a);
        sb.append(", commits=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
