package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a70 {
    public z60 a;
    public String b;
    public String c;

    public a70(z60 z60Var, String str, String str2) {
        this.a = z60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return k71.k.b(this.a, a70Var.a) && k71.k.b(this.b, a70Var.b) && k71.k.b(this.c, a70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(topRepositories=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
