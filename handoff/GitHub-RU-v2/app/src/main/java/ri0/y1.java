package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y1 implements aa.h0 {
    public String a;
    public Integer b;
    public String c;

    public y1(Integer num, String str, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return k71.k.b(this.a, y1Var.a) && k71.k.b(this.b, y1Var.b) && k71.k.b(this.c, y1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.r(this.b, "PullRequestCommentCountFragment(id=", this.a, ", totalCommentsCount=", ", __typename="), this.c, ")");
    }
}
