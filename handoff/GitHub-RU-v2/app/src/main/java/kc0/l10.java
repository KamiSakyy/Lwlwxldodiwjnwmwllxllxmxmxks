package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l10 {
    public final k10 a;
    public final String b;
    public final String c;

    public l10(k10 k10Var, String str, String str2) {
        this.a = k10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return k71.k.b(this.a, l10Var.a) && k71.k.b(this.b, l10Var.b) && k71.k.b(this.c, l10Var.c);
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
