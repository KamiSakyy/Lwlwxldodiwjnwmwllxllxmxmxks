package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c10 implements aaShadow.v0 {
    public e10 a;
    public String b;
    public String c;

    public c10(e10 e10Var, String str, String str2) {
        this.a = e10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        return k71.k.b(this.a, c10Var.a) && k71.k.b(this.b, c10Var.b) && k71.k.b(this.c, c10Var.c);
    }

    public final int hashCode() {
        e10 e10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((e10Var == null ? 0 : e10Var.hashCode()) * 31, this.b, 31);
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
