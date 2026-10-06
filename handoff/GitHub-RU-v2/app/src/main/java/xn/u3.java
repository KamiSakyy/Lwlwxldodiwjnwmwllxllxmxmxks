package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u3 implements y3 {
    public long a;
    public String b;
    public String c;
    public String d;
    public Long e;

    public u3(long j, String str, String str2, String str3, Long l) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.a == u3Var.a && k71.k.b(this.b, u3Var.b) && k71.k.b(this.c, u3Var.c) && k71.k.b(this.d, u3Var.d) && k71.k.b(this.e, u3Var.e);
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() + com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31)) * 31) - 1958562043) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        Long l = this.e;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestReview(userDatabaseId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        f1.e.x(sb, ", eventContent=", this.c, ", label=a pull request review, url=", this.d);
        sb.append(", globalId=null, reviewId=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
