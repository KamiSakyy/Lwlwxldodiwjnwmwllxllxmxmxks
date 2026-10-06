package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tc0 {
    public String a;
    public uc0 b;
    public wc0 c;
    public pc0 d;
    public String e;

    public tc0(String str, uc0 uc0Var, wc0 wc0Var, pc0 pc0Var, String str2) {
        this.a = str;
        this.b = uc0Var;
        this.c = wc0Var;
        this.d = pc0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc0)) {
            return false;
        }
        tc0 tc0Var = (tc0) obj;
        return k71.k.b(this.a, tc0Var.a) && k71.k.b(this.b, tc0Var.b) && k71.k.b(this.c, tc0Var.c) && k71.k.b(this.d, tc0Var.d) && k71.k.b(this.e, tc0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wc0 wc0Var = this.c;
        int hashCode2 = (hashCode + (wc0Var == null ? 0 : wc0Var.hashCode())) * 31;
        pc0 pc0Var = this.d;
        return this.e.hashCode() + ((hashCode2 + (pc0Var != null ? pc0Var.hashCode() : 0)) * 31);
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
