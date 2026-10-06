package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o6 {
    public final String a;
    public final n6 b;
    public final String c;

    public o6(String str, n6 n6Var, String str2) {
        this.a = str;
        this.b = n6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return k71.k.b(this.a, o6Var.a) && k71.k.b(this.b, o6Var.b) && k71.k.b(this.c, o6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n6 n6Var = this.b;
        return this.c.hashCode() + ((hashCode + (n6Var == null ? 0 : n6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comparison(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
