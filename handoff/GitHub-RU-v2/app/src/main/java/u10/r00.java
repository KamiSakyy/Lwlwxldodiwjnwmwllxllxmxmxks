package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r00 {
    public final x00 a;
    public final String b;
    public final String c;

    public r00(x00 x00Var, String str, String str2) {
        this.a = x00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return k71.k.b(this.a, r00Var.a) && k71.k.b(this.b, r00Var.b) && k71.k.b(this.c, r00Var.c);
    }

    public final int hashCode() {
        x00 x00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((x00Var == null ? 0 : x00Var.hashCode()) * 31, this.b, 31);
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
