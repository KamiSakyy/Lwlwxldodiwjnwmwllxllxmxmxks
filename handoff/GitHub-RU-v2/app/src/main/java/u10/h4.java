package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h4 {
    public final String a;
    public final w3 b;
    public final String c;

    public h4(String str, w3 w3Var, String str2) {
        this.a = str;
        this.b = w3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return k71.k.b(this.a, h4Var.a) && k71.k.b(this.b, h4Var.b) && k71.k.b(this.c, h4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(id=");
        sb.append(this.a);
        sb.append(", contexts=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
