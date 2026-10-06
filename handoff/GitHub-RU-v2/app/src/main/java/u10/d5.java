package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d5 {
    public final String a;
    public final c5 b;
    public final String c;

    public d5(String str, c5 c5Var, String str2) {
        this.a = str;
        this.b = c5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return k71.k.b(this.a, d5Var.a) && k71.k.b(this.b, d5Var.b) && k71.k.b(this.c, d5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c5 c5Var = this.b;
        return this.c.hashCode() + ((hashCode + (c5Var == null ? 0 : c5Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
