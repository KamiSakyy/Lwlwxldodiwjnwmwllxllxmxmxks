package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements aa.h0 {
    public final String a;
    public final b1 b;
    public final String c;

    public c1(String str, b1 b1Var, String str2) {
        this.a = str;
        this.b = b1Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && k71.k.b(this.b, c1Var.b) && k71.k.b(this.c, c1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestV2ItemsFragment(id=");
        sb.append(this.a);
        sb.append(", projectItems=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
