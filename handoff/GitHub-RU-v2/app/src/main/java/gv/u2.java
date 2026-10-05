package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u2 {
    public final String a;
    public final o2 b;
    public final String c;

    public u2(String str, o2 o2Var, String str2) {
        this.a = str;
        this.b = o2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return k71.k.b(this.a, u2Var.a) && k71.k.b(this.b, u2Var.b) && k71.k.b(this.c, u2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
