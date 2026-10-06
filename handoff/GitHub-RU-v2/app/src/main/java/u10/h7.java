package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h7 {
    public String a;
    public o7 b;
    public String c;

    public h7(String str, o7 o7Var, String str2) {
        this.a = str;
        this.b = o7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return k71.k.b(this.a, h7Var.a) && k71.k.b(this.b, h7Var.b) && k71.k.b(this.c, h7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o7 o7Var = this.b;
        return this.c.hashCode() + ((hashCode + (o7Var == null ? 0 : o7Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Answer(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
