package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y70 implements aa.v0 {
    public final z70 a;
    public final String b;
    public final String c;

    public y70(z70 z70Var, String str, String str2) {
        this.a = z70Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj;
        return k71.k.b(this.a, y70Var.a) && k71.k.b(this.b, y70Var.b) && k71.k.b(this.c, y70Var.c);
    }

    public final int hashCode() {
        z70 z70Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((z70Var == null ? 0 : z70Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
