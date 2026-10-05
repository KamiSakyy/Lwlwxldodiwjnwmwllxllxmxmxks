package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p5 {
    public final String a;
    public final j5 b;
    public final String c;

    public p5(String str, j5 j5Var, String str2) {
        this.a = str;
        this.b = j5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return k71.k.b(this.a, p5Var.a) && k71.k.b(this.b, p5Var.b) && k71.k.b(this.c, p5Var.c);
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
