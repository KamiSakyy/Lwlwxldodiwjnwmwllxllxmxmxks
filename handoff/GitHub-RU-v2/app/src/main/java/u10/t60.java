package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t60 {
    public String a;
    public u60 b;
    public w60 c;
    public p60 d;
    public String e;

    public t60(String str, u60 u60Var, w60 w60Var, p60 p60Var, String str2) {
        this.a = str;
        this.b = u60Var;
        this.c = w60Var;
        this.d = p60Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t60)) {
            return false;
        }
        t60 t60Var = (t60) obj;
        return k71.k.b(this.a, t60Var.a) && k71.k.b(this.b, t60Var.b) && k71.k.b(this.c, t60Var.c) && k71.k.b(this.d, t60Var.d) && k71.k.b(this.e, t60Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        w60 w60Var = this.c;
        int hashCode2 = (hashCode + (w60Var == null ? 0 : w60Var.hashCode())) * 31;
        p60 p60Var = this.d;
        return this.e.hashCode() + ((hashCode2 + (p60Var != null ? p60Var.hashCode() : 0)) * 31);
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
