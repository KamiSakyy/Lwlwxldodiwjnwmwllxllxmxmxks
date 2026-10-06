package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h50 implements aaShadow.v0 {
    public final l50 a;
    public final String b;
    public final String c;

    public h50(l50 l50Var, String str, String str2) {
        this.a = l50Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        return k71.k.b(this.a, h50Var.a) && k71.k.b(this.b, h50Var.b) && k71.k.b(this.c, h50Var.c);
    }

    public final int hashCode() {
        l50 l50Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((l50Var == null ? 0 : l50Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryOwner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
