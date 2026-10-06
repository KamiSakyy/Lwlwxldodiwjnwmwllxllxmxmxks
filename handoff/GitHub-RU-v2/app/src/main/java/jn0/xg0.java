package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xg0 {
    public final wg0 a;
    public final String b;
    public final String c;

    public xg0(wg0 wg0Var, String str, String str2) {
        this.a = wg0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg0)) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        return k71.k.b(this.a, xg0Var.a) && k71.k.b(this.b, xg0Var.b) && k71.k.b(this.c, xg0Var.c);
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
