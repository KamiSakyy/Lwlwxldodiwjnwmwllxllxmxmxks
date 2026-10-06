package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x9 {
    public String a;
    public u9 b;
    public String c;

    public x9(String str, u9 u9Var, String str2) {
        this.a = str;
        this.b = u9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return k71.k.b(this.a, x9Var.a) && k71.k.b(this.b, x9Var.b) && k71.k.b(this.c, x9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussionCategories=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
