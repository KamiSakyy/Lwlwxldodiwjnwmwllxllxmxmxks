package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x20 implements aaShadow.v0 {
    public final b30 a;
    public final String b;
    public final String c;

    public x20(b30 b30Var, String str, String str2) {
        this.a = b30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x20)) {
            return false;
        }
        x20 x20Var = (x20) obj;
        return k71.k.b(this.a, x20Var.a) && k71.k.b(this.b, x20Var.b) && k71.k.b(this.c, x20Var.c);
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
