package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l8 {
    public String a;
    public k8 b;
    public String c;

    public l8(String str, k8 k8Var, String str2) {
        this.a = str;
        this.b = k8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return k71.k.b(this.a, l8Var.a) && k71.k.b(this.b, l8Var.b) && k71.k.b(this.c, l8Var.c);
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
