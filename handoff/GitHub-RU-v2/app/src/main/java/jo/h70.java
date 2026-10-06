package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h70 implements aaShadow.v0 {
    public j70 a;
    public String b;
    public String c;

    public h70(j70 j70Var, String str, String str2) {
        this.a = j70Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h70)) {
            return false;
        }
        h70 h70Var = (h70) obj;
        return k71.k.b(this.a, h70Var.a) && k71.k.b(this.b, h70Var.b) && k71.k.b(this.c, h70Var.c);
    }

    public final int hashCode() {
        j70 j70Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((j70Var == null ? 0 : j70Var.hashCode()) * 31, this.b, 31);
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
