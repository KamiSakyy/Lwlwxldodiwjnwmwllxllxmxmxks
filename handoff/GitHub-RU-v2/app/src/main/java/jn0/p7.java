package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p7 {
    public String a;
    public q7 b;
    public int c;
    public String d;
    public String e;

    public p7(String str, q7 q7Var, int i, String str2, String str3) {
        this.a = str;
        this.b = q7Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return k71.k.b(this.a, p7Var.a) && k71.k.b(this.b, p7Var.b) && this.c == p7Var.c && k71.k.b(this.d, p7Var.d) && k71.k.b(this.e, p7Var.e);
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
