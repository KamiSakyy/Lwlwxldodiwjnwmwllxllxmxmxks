package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s9 implements aaShadow.v0 {
    public x9 a;
    public String b;
    public String c;

    public s9(x9 x9Var, String str, String str2) {
        this.a = x9Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return k71.k.b(this.a, s9Var.a) && k71.k.b(this.b, s9Var.b) && k71.k.b(this.c, s9Var.c);
    }

    public final int hashCode() {
        x9 x9Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((x9Var == null ? 0 : x9Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
