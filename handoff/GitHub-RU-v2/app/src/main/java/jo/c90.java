package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c90 {
    public final String a;
    public final u80 b;
    public final String c;

    public c90(String str, u80 u80Var, String str2) {
        this.a = str;
        this.b = u80Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return k71.k.b(this.a, c90Var.a) && k71.k.b(this.b, c90Var.b) && k71.k.b(this.c, c90Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u80 u80Var = this.b;
        return this.c.hashCode() + ((hashCode + (u80Var == null ? 0 : u80Var.hashCode())) * 31);
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
