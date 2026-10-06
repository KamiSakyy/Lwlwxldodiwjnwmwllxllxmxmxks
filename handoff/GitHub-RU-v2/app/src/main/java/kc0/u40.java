package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u40 {
    public int a;
    public v40 b;
    public String c;
    public String d;

    public u40(int i, v40 v40Var, String str, String str2) {
        this.a = i;
        this.b = v40Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return this.a == u40Var.a && k71.k.b(this.b, u40Var.b) && k71.k.b(this.c, u40Var.c) && k71.k.b(this.d, u40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(number=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
