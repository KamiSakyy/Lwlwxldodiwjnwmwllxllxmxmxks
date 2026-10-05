package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y60 {
    public final x60 a;
    public final String b;
    public final String c;

    public y60(x60 x60Var, String str, String str2) {
        this.a = x60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj;
        return k71.k.b(this.a, y60Var.a) && k71.k.b(this.b, y60Var.b) && k71.k.b(this.c, y60Var.c);
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
