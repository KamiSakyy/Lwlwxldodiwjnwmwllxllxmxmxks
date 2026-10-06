package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h10 implements aaShadow.v0 {
    public l10 a;
    public String b;
    public String c;

    public h10(l10 l10Var, String str, String str2) {
        this.a = l10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj;
        return k71.k.b(this.a, h10Var.a) && k71.k.b(this.b, h10Var.b) && k71.k.b(this.c, h10Var.c);
    }

    public final int hashCode() {
        l10 l10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((l10Var == null ? 0 : l10Var.hashCode()) * 31, this.b, 31);
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
