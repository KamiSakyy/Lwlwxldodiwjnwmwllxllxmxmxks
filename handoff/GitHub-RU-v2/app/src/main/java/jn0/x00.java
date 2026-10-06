package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x00 implements aaShadow.v0 {
    public z00 a;
    public String b;
    public String c;

    public x00(z00 z00Var, String str, String str2) {
        this.a = z00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        return k71.k.b(this.a, x00Var.a) && k71.k.b(this.b, x00Var.b) && k71.k.b(this.c, x00Var.c);
    }

    public final int hashCode() {
        z00 z00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((z00Var == null ? 0 : z00Var.hashCode()) * 31, this.b, 31);
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
