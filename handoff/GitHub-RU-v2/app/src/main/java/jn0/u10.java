package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u10 {
    public final t10 a;
    public final String b;
    public final String c;

    public u10(t10 t10Var, String str, String str2) {
        this.a = t10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u10)) {
            return false;
        }
        u10 u10Var = (u10) obj;
        return k71.k.b(this.a, u10Var.a) && k71.k.b(this.b, u10Var.b) && k71.k.b(this.c, u10Var.c);
    }

    public final int hashCode() {
        t10 t10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((t10Var == null ? 0 : t10Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(readme=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
