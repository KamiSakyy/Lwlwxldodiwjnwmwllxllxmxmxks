package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m10 {
    public final String a;
    public final d10 b;
    public final String c;

    public m10(String str, d10 d10Var, String str2) {
        this.a = str;
        this.b = d10Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m10)) {
            return false;
        }
        m10 m10Var = (m10) obj;
        return k71.k.b(this.a, m10Var.a) && k71.k.b(this.b, m10Var.b) && k71.k.b(this.c, m10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", activePullRequests=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
