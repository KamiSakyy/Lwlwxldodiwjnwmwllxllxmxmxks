package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 {
    public final i2 a;
    public final String b;
    public final String c;

    public y1(i2 i2Var, String str, String str2) {
        this.a = i2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return k71.k.b(this.a, y1Var.a) && k71.k.b(this.b, y1Var.b) && k71.k.b(this.c, y1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(topic=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
