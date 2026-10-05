package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w20 {
    public final String a;
    public final o20 b;
    public final String c;

    public w20(String str, o20 o20Var, String str2) {
        this.a = str;
        this.b = o20Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w20)) {
            return false;
        }
        w20 w20Var = (w20) obj;
        return k71.k.b(this.a, w20Var.a) && k71.k.b(this.b, w20Var.b) && k71.k.b(this.c, w20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o20 o20Var = this.b;
        return this.c.hashCode() + ((hashCode + (o20Var == null ? 0 : o20Var.hashCode())) * 31);
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
