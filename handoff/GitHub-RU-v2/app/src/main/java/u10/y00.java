package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y00 {
    public final String a;
    public final q00 b;
    public final String c;

    public y00(String str, q00 q00Var, String str2) {
        this.a = str;
        this.b = q00Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return k71.k.b(this.a, y00Var.a) && k71.k.b(this.b, y00Var.b) && k71.k.b(this.c, y00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q00 q00Var = this.b;
        return this.c.hashCode() + ((hashCode + (q00Var == null ? 0 : q00Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
