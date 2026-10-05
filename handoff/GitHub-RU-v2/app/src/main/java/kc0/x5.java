package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 {
    public final String a;
    public final r5 b;
    public final String c;

    public x5(String str, r5 r5Var, String str2) {
        this.a = str;
        this.b = r5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return k71.k.b(this.a, x5Var.a) && k71.k.b(this.b, x5Var.b) && k71.k.b(this.c, x5Var.c);
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
