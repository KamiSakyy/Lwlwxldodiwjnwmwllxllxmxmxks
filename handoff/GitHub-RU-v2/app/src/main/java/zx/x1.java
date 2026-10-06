package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 {
    public String a;
    public u1 b;
    public String c;

    public x1(String str, u1 u1Var, String str2) {
        this.a = str;
        this.b = u1Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return k71.k.b(this.a, x1Var.a) && k71.k.b(this.b, x1Var.b) && k71.k.b(this.c, x1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u1 u1Var = this.b;
        return this.c.hashCode() + ((hashCode + (u1Var == null ? 0 : u1Var.hashCode())) * 31);
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
