package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t80 {
    public String a;
    public u80 b;
    public w80 c;
    public p80 d;
    public String e;

    public t80(String str, u80 u80Var, w80 w80Var, p80 p80Var, String str2) {
        this.a = str;
        this.b = u80Var;
        this.c = w80Var;
        this.d = p80Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return k71.k.b(this.a, t80Var.a) && k71.k.b(this.b, t80Var.b) && k71.k.b(this.c, t80Var.c) && k71.k.b(this.d, t80Var.d) && k71.k.b(this.e, t80Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        w80 w80Var = this.c;
        int hashCode2 = (hashCode + (w80Var == null ? 0 : w80Var.hashCode())) * 31;
        p80 p80Var = this.d;
        return this.e.hashCode() + ((hashCode2 + (p80Var != null ? p80Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", reviewRequests=");
        sb.append(this.c);
        sb.append(", latestReviews=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
