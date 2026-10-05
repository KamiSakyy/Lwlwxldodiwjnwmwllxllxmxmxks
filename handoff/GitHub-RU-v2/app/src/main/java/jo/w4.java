package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w4 {
    public final String a;
    public final l4 b;
    public final String c;

    public w4(String str, l4 l4Var, String str2) {
        this.a = str;
        this.b = l4Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return k71.k.b(this.a, w4Var.a) && k71.k.b(this.b, w4Var.b) && k71.k.b(this.c, w4Var.c);
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
