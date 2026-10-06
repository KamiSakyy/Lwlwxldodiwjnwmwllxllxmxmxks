package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z20 {
    public final String a;
    public final y20 b;
    public final String c;

    public z20(String str, y20 y20Var, String str2) {
        this.a = str;
        this.b = y20Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj;
        return k71.k.b(this.a, z20Var.a) && k71.k.b(this.b, z20Var.b) && k71.k.b(this.c, z20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y20 y20Var = this.b;
        return this.c.hashCode() + ((hashCode + (y20Var == null ? 0 : y20Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", mergeQueue=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
