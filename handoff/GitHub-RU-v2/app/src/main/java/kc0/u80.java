package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u80 {
    public String a;
    public s80 b;
    public String c;

    public u80(String str, s80 s80Var, String str2) {
        this.a = str;
        this.b = s80Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return k71.k.b(this.a, u80Var.a) && k71.k.b(this.b, u80Var.b) && k71.k.b(this.c, u80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
