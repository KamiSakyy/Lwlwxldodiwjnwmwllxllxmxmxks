package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h00 {
    public b00 a;
    public String b;
    public String c;

    public h00(b00 b00Var, String str, String str2) {
        this.a = b00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        return k71.k.b(this.a, h00Var.a) && k71.k.b(this.b, h00Var.b) && k71.k.b(this.c, h00Var.c);
    }

    public final int hashCode() {
        b00 b00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((b00Var == null ? 0 : b00Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(author=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
