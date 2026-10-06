package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c20 implements aaShadow.v0 {
    public h20 a;
    public String b;
    public String c;

    public c20(h20 h20Var, String str, String str2) {
        this.a = h20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c20)) {
            return false;
        }
        c20 c20Var = (c20) obj;
        return k71.k.b(this.a, c20Var.a) && k71.k.b(this.b, c20Var.b) && k71.k.b(this.c, c20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(search=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
