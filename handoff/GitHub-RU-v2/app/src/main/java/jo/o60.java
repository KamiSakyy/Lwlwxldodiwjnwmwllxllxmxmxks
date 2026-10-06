package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o60 {
    public s60 a;
    public String b;
    public String c;

    public o60(s60 s60Var, String str, String str2) {
        this.a = s60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o60)) {
            return false;
        }
        o60 o60Var = (o60) obj;
        return k71.k.b(this.a, o60Var.a) && k71.k.b(this.b, o60Var.b) && k71.k.b(this.c, o60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dashboard(shortcuts=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
