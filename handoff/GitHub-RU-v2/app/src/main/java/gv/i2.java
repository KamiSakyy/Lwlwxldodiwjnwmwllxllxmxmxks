package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 implements aa.h0 {
    public String a;
    public Integer b;
    public String c;

    public i2(Integer num, String str, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b) && k71.k.b(this.c, i2Var.c);
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
