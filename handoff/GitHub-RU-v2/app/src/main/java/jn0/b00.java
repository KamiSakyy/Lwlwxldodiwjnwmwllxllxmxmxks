package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b00 implements aaShadow.v0 {
    public c00 a;
    public String b;
    public String c;

    public b00(c00 c00Var, String str, String str2) {
        this.a = c00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b00)) {
            return false;
        }
        b00 b00Var = (b00) obj;
        return k71.k.b(this.a, b00Var.a) && k71.k.b(this.b, b00Var.b) && k71.k.b(this.c, b00Var.c);
    }

    public final int hashCode() {
        c00 c00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((c00Var == null ? 0 : c00Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
