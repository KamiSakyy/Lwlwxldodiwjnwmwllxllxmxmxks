package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e30 {
    public String a;
    public d30 b;
    public String c;

    public e30(String str, d30 d30Var, String str2) {
        this.a = str;
        this.b = d30Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return k71.k.b(this.a, e30Var.a) && k71.k.b(this.b, e30Var.b) && k71.k.b(this.c, e30Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d30 d30Var = this.b;
        return this.c.hashCode() + ((hashCode + (d30Var == null ? 0 : d30Var.hashCode())) * 31);
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
