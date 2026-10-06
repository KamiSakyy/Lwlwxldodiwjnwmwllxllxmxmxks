package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p60 {
    public String a;
    public h60 b;
    public String c;

    public p60(String str, h60 h60Var, String str2) {
        this.a = str;
        this.b = h60Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p60)) {
            return false;
        }
        p60 p60Var = (p60) obj;
        return k71.k.b(this.a, p60Var.a) && k71.k.b(this.b, p60Var.b) && k71.k.b(this.c, p60Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h60 h60Var = this.b;
        return this.c.hashCode() + ((hashCode + (h60Var == null ? 0 : h60Var.hashCode())) * 31);
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
