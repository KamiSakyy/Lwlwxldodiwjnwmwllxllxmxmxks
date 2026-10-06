package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n9 {
    public final String a;
    public final m9 b;
    public final String c;

    public n9(String str, m9 m9Var, String str2) {
        this.a = str;
        this.b = m9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return k71.k.b(this.a, n9Var.a) && k71.k.b(this.b, n9Var.b) && k71.k.b(this.c, n9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestReview(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
