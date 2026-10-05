package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b7 {
    public final f7 a;
    public final String b;
    public final String c;

    public b7(f7 f7Var, String str, String str2) {
        this.a = f7Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return k71.k.b(this.a, b7Var.a) && k71.k.b(this.b, b7Var.b) && k71.k.b(this.c, b7Var.c);
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
