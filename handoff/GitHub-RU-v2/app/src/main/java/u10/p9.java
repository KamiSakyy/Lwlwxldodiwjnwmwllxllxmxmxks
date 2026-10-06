package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p9 {
    public String a;
    public m9 b;
    public String c;

    public p9(String str, m9 m9Var, String str2) {
        this.a = str;
        this.b = m9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return k71.k.b(this.a, p9Var.a) && k71.k.b(this.b, p9Var.b) && k71.k.b(this.c, p9Var.c);
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
