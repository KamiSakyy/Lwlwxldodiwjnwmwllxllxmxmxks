package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 {
    public final String a;
    public final z3 b;
    public final String c;

    public a4(String str, z3 z3Var, String str2) {
        this.a = str;
        this.b = z3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && k71.k.b(this.b, a4Var.b) && k71.k.b(this.c, a4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z3 z3Var = this.b;
        return this.c.hashCode() + ((hashCode + (z3Var == null ? 0 : z3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(id=");
        sb.append(this.a);
        sb.append(", savedReplies=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
