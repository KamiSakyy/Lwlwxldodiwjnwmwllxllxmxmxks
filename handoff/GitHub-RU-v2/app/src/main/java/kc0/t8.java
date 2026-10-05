package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t8 {
    public final String a;
    public final s8 b;
    public final String c;

    public t8(String str, s8 s8Var, String str2) {
        this.a = str;
        this.b = s8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return k71.k.b(this.a, t8Var.a) && k71.k.b(this.b, t8Var.b) && k71.k.b(this.c, t8Var.c);
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
