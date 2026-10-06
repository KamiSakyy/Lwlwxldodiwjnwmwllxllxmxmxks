package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hf0 {
    public String a;
    public if0 b;
    public kf0 c;
    public df0 d;
    public String e;

    public hf0(String str, if0 if0Var, kf0 kf0Var, df0 df0Var, String str2) {
        this.a = str;
        this.b = if0Var;
        this.c = kf0Var;
        this.d = df0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf0)) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        return k71.k.b(this.a, hf0Var.a) && k71.k.b(this.b, hf0Var.b) && k71.k.b(this.c, hf0Var.c) && k71.k.b(this.d, hf0Var.d) && k71.k.b(this.e, hf0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kf0 kf0Var = this.c;
        int hashCode2 = (hashCode + (kf0Var == null ? 0 : kf0Var.hashCode())) * 31;
        df0 df0Var = this.d;
        return this.e.hashCode() + ((hashCode2 + (df0Var != null ? df0Var.hashCode() : 0)) * 31);
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
