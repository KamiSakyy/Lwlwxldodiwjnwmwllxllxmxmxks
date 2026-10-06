package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v9 {
    public String a;
    public z9 b;
    public String c;

    public v9(String str, z9 z9Var, String str2) {
        this.a = str;
        this.b = z9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return k71.k.b(this.a, v9Var.a) && k71.k.b(this.b, v9Var.b) && k71.k.b(this.c, v9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z9 z9Var = this.b;
        return this.c.hashCode() + ((hashCode + (z9Var == null ? 0 : z9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
