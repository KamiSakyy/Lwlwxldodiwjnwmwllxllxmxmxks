package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i00 {
    public final int a;
    public final h00 b;
    public final c00 c;
    public final String d;
    public final String e;

    public i00(int i, h00 h00Var, c00 c00Var, String str, String str2) {
        this.a = i;
        this.b = h00Var;
        this.c = c00Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        return this.a == i00Var.a && k71.k.b(this.b, i00Var.b) && k71.k.b(this.c, i00Var.c) && k71.k.b(this.d, i00Var.d) && k71.k.b(this.e, i00Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        h00 h00Var = this.b;
        int hashCode2 = (hashCode + (h00Var == null ? 0 : h00Var.hashCode())) * 31;
        c00 c00Var = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((hashCode2 + (c00Var != null ? c00Var.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(planLimit=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", collaborators=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
