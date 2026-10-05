package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a50 {
    public final z40 a;
    public final String b;
    public final String c;

    public a50(z40 z40Var, String str, String str2) {
        this.a = z40Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return k71.k.b(this.a, a50Var.a) && k71.k.b(this.b, a50Var.b) && k71.k.b(this.c, a50Var.c);
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
