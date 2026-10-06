package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i60 {
    public o60 a;
    public String b;
    public String c;

    public i60(o60 o60Var, String str, String str2) {
        this.a = o60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i60)) {
            return false;
        }
        i60 i60Var = (i60) obj;
        return k71.k.b(this.a, i60Var.a) && k71.k.b(this.b, i60Var.b) && k71.k.b(this.c, i60Var.c);
    }

    public final int hashCode() {
        o60 o60Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((o60Var == null ? 0 : o60Var.hashCode()) * 31, this.b, 31);
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
