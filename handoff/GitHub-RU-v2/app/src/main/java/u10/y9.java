package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y9 {
    public final String a;
    public final v9 b;
    public final String c;

    public y9(String str, v9 v9Var, String str2) {
        this.a = str;
        this.b = v9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return k71.k.b(this.a, y9Var.a) && k71.k.b(this.b, y9Var.b) && k71.k.b(this.c, y9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v9 v9Var = this.b;
        return this.c.hashCode() + ((hashCode + (v9Var == null ? 0 : v9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Discussion(id=");
        sb.append(this.a);
        sb.append(", comment=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
