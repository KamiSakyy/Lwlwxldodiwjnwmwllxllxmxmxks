package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v80 {
    public final b90 a;
    public final String b;
    public final String c;

    public v80(b90 b90Var, String str, String str2) {
        this.a = b90Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj;
        return k71.k.b(this.a, v80Var.a) && k71.k.b(this.b, v80Var.b) && k71.k.b(this.c, v80Var.c);
    }

    public final int hashCode() {
        b90 b90Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((b90Var == null ? 0 : b90Var.hashCode()) * 31, this.b, 31);
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
