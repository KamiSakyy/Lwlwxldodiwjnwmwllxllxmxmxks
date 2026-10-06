package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e5 {
    public String a;
    public p4 b;
    public String c;

    public e5(String str, p4 p4Var, String str2) {
        this.a = str;
        this.b = p4Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return k71.k.b(this.a, e5Var.a) && k71.k.b(this.b, e5Var.b) && k71.k.b(this.c, e5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node4(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
