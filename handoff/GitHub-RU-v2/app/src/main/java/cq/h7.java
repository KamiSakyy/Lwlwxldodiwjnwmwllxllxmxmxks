package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h7 {
    public e7 a;
    public String b;
    public String c;

    public h7(e7 e7Var, String str, String str2) {
        this.a = e7Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return k71.k.b(this.a, h7Var.a) && k71.k.b(this.b, h7Var.b) && k71.k.b(this.c, h7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(commit=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
