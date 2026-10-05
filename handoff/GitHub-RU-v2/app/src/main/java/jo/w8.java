package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w8 {
    public final a9 a;
    public final String b;
    public final String c;

    public w8(a9 a9Var, String str, String str2) {
        this.a = a9Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return k71.k.b(this.a, w8Var.a) && k71.k.b(this.b, w8Var.b) && k71.k.b(this.c, w8Var.c);
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
