package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p20 {
    public v20 a;
    public String b;
    public String c;

    public p20(v20 v20Var, String str, String str2) {
        this.a = v20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj;
        return k71.k.b(this.a, p20Var.a) && k71.k.b(this.b, p20Var.b) && k71.k.b(this.c, p20Var.c);
    }

    public final int hashCode() {
        v20 v20Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((v20Var == null ? 0 : v20Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(pullRequestReview=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
