package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m8 {
    public String a;
    public n8 b;
    public int c;
    public String d;
    public String e;

    public m8(String str, n8 n8Var, int i, String str2, String str3) {
        this.a = str;
        this.b = n8Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return k71.k.b(this.a, m8Var.a) && k71.k.b(this.b, m8Var.b) && this.c == m8Var.c && k71.k.b(this.d, m8Var.d) && k71.k.b(this.e, m8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", number=");
        x.i.r(this.c, ", title=", this.d, ", __typename=", sb);
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
