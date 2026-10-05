package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xa0 {
    public final wa0 a;
    public final String b;
    public final String c;

    public xa0(wa0 wa0Var, String str, String str2) {
        this.a = wa0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        return k71.k.b(this.a, xa0Var.a) && k71.k.b(this.b, xa0Var.b) && k71.k.b(this.c, xa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(repositories=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
